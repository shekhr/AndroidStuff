package com.mycodelabs.httprequest;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
private TextView textView;
    private ProgressDialog pdialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.text);
        pdialog=new ProgressDialog(this);
        pdialog.setCancelable(false);
        pdialog.setMessage("Loading");
        pdialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pdialog.setProgress(0);
    }

    public void onClick(View view) {

        if(Utils.checkNetworkConnectivity(getApplicationContext())){

                new HttpAsyncTask().execute("https://api.myjson.com/bins/4lwrn");

        }
    }
    private class HttpAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Showing progress dialog
          pdialog.show();

        }

        @Override
        protected String doInBackground(String... arg0) {
            try {

                Log.d("Http","Response Before Server:   " +arg0[0]);
                String response = HttpClient.sendGet(arg0[0]);

                Log.d("Http", "Response From Server:   " + response);

                return response;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }


        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            if (pdialog.isShowing()) {
                pdialog.dismiss();
            }
            System.out.println("Result is:   " + result);
            JSONObject jsonObject= null;
            if(result!=null && !result.isEmpty()) {
                try {
                    jsonObject = new JSONObject(result);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (jsonObject != null && jsonObject.has("mycodelabs")) {
                    String awesome = null;
                    try {
                        awesome = jsonObject.getString("mycodelabs");
                        textView.setText(awesome);
                        textView.setBackgroundColor(Color.GREEN);
                        textView.setTextColor(Color.BLACK);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            }
            else {
                textView.setText("Kindly check the Url");
            }

        }

    }
}
