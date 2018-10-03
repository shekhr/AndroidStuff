package com.mycodelabs.networkavailability;

import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
    }

    public void onClick(View view) {

            // get the system ConnectivityManager
            ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext()
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo != null && (networkInfo.isAvailable() || networkInfo.isConnectedOrConnecting())) {
                if(networkInfo.getState()== NetworkInfo.State.CONNECTED){
                    textView.setText(R.string.connected); // setting the text as Connected if our phone is connected to a network.
                    textView.setBackgroundColor(Color.GREEN); // setting the background color of the textView as green if our phone is connected to a network.
                } 

                // record the fact that there is live connection
            }else {
                textView.setText(R.string.not_connected);
                textView.setBackgroundColor(Color.RED);
            }


    }
}
