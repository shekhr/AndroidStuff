package com.diazapps.passtocss;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CredentialsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credentials);
        Button button = findViewById(R.id.buttonGo);

        TextView user = findViewById(R.id.myUSername);
        TextView pass = findViewById(R.id.myPassword);
        TextView school = findViewById(R.id.mySchool);
        SharedPreferences preferences = getSharedPreferences("MyPrefs",0);
        if (preferences!=null) {
            if (preferences.contains("email")) {
                user.setText(preferences.getString("email", ""));
            }
            if (preferences.contains("pass")) {
                pass.setText(preferences.getString("pass", ""));
            }
            if (preferences.contains("school")) {
                school.setText(preferences.getString("school", ""));
            }
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CredentialsActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
