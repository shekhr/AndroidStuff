package io.github.shekhr.httpurlconnection;

import android.util.Log;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class HttpClient {

    // HTTP GET request
    public static String sendGet(String url) throws Exception {

        HttpURLConnection con = null;
        BufferedReader br = null;
        StringBuffer response = new StringBuffer();


        try {
          /*  // _______________________________________________

            HttpsURLConnection.setDefaultHostnameVerifier(new NullHostNameVerifier());
            SSLContext context = null;
            try {
                context = SSLContext.getInstance("TLS");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            try {
                if (context != null) {
                    context.init(null, new X509TrustManager[]{new NullX509TrustManager()}, new SecureRandom());
                }
            } catch (KeyManagementException e) {
                e.printStackTrace();
            }
            if (context != null) {
                HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
            }

            //________________________________________________________*/

            URL obj = new URL(url);


            con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");
            con.setConnectTimeout(Constants.CONNECTION_TIMEOUT); // time seconds as connection timeout

            int responseCode = con.getResponseCode();
            String contentType=con.getContentType();
            Log.d("Log", "Status Code :" + responseCode);
            if (responseCode == 200 && contentType.equals("application/json")) {
                InputStream stream = con.getInputStream();
                InputStreamReader isReader = new InputStreamReader(stream);

                //put output stream into activity_details string
                br = new BufferedReader(isReader);
                String inputLine;
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                return response.toString();
            }
            if (responseCode == 204) {
                Log.d("Logs Response Code 204", "Action has been enacted but the response does not include an entity");
                return null;
            }
            if (responseCode == 503) {
                Log.d("Logs Response Code 503", "Service Unavailable");
                return null;
            }
            return null;
        } catch (MalformedURLException e) {
            Log.d("Logs Malformed Url", e.toString());
            e.printStackTrace();
            return null;
        } catch (ConnectException e) {
            Log.d("Logs Timeout ", "Connect Timeout ");
            e.printStackTrace();
            return "timeout";
        } catch (IOException e) {
            Log.d("Logs IO Exception", e.toString());
            e.printStackTrace();
            return null;
        } finally {
            try {
                if(br!=null)
                br.close();
                if(con!=null)
                con.disconnect();
            } catch (Exception e) {
                //If you want further info on failure...
                //return null;
            }
        }


    }
}