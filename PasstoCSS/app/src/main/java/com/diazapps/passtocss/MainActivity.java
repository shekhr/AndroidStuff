package com.diazapps.passtocss;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGo = findViewById(R.id.buttonGo);
        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,CredentialsActivity.class);
                if (validate())
                startActivity(intent);
                else {
                    Toast.makeText(getApplicationContext(),"Wrong Username Password. Kindly register",Toast.LENGTH_SHORT).show();

                }
            }
        });

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });
    }
    private boolean validate(){
        boolean flag = false;
        SharedPreferences preferences = getSharedPreferences("MyPrefs",0);

        EditText email = findViewById(R.id.editUsername);
        EditText pass = findViewById(R.id.editPassword);

        if(preferences.contains("email") && email.getText().toString().equals(preferences.getString("email",""))){
            flag = true;
        }else{
            flag = false;
        }
        if (preferences.contains("pass") && pass.getText().toString().equals(preferences.getString("pass",""))){
            flag = true;
        }else {
            flag = false;
        }
return flag;
    }
}
