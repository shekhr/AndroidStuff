package com.mycodelabs.httprequest;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by shekhar on 22-Jun-16.
 */
public class HttpClient {

    // HTTP GET request
    // Here you can return anything as I will be returning a string
    public static String sendGet(String url) throws Exception {

        HttpURLConnection con = null;
        BufferedReader br = null;
        StringBuffer response = new StringBuffer();


        try {

            URL obj = new URL(url);

            con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");
            con.setConnectTimeout(120000);

            int responseCode = con.getResponseCode();
            //String contentType=con.getContentType();
            Log.d("HttpRequest", "Status Code :" + responseCode);
            if (responseCode == 200) { // if the response code = 200, it means that the service hit the server successfully and got some response in return.
                InputStream stream = con.getInputStream(); // the response from the server is in the form of stream and we get it using InputStream.
                InputStreamReader isReader = new InputStreamReader(stream);

                //put output stream into activity_details string
                br = new BufferedReader(isReader);
                String inputLine;
                while ((inputLine = br.readLine()) != null) { // we get the response data in inputline line by line and we append the data in the response StringBuffer object
                    response.append(inputLine);
                }
                return response.toString();
            }
            if (responseCode == 204) {
                Log.d("Response Code 204", "Action has been enacted but the response does not include an entity");
                return null;
            }
            if (responseCode == 503) {
                Log.d(" Response Code 503", "Service Unavailable");
                return null;
            }
            return null;
        } catch (MalformedURLException e) {
            Log.d("Malformed Url", e.toString());
            e.printStackTrace();
            return null;
        } catch (ConnectException e) {
            Log.d("HttpRequest Timeout ", "Connect Timeout ");
            e.printStackTrace();
            return "timeout";
        } catch (IOException e) {
            Log.d("IO Exception", e.toString());
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
