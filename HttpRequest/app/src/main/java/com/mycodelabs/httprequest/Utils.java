package com.mycodelabs.httprequest;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by shekhar on 22-Jun-16.
 */
public class Utils {

    public static boolean checkNetworkConnectivity(Context context) {
        // get the system ConnectivityManager
        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && (networkInfo.isAvailable() || networkInfo.isConnectedOrConnecting())) {
            if(networkInfo.getState()== NetworkInfo.State.CONNECTED){
                return true;
            }
            // record the fact that there is live connection
        }
        return false;

    }
}
