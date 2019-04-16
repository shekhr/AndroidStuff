package com.diazapps.passtocss;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button button = findViewById(R.id.buttonGo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this,CredentialsActivity.class);
                if(callMethod())
                startActivity(intent);
            }
        });







    }
    public boolean callMethod(){
        SharedPreferences.Editor preferences = getSharedPreferences("MyPrefs",0).edit();
        EditText editName = findViewById(R.id.editName);
        String name = editName.getText().toString();
        EditText editEmail = findViewById(R.id.editEmail);
        String email = editEmail.getText().toString();
        EditText editPass = findViewById(R.id.editText);
        String pass = editPass.getText().toString();
        EditText editConfpass = findViewById(R.id.editText2);
        String confPass = editConfpass.getText().toString();
        EditText editSchool = findViewById(R.id.editText4);
        String school = editSchool.getText().toString();
        EditText editFav = findViewById(R.id.editText5);
        String favThing = editFav.getText().toString();

        if(!pass.equals(confPass)){
            Toast.makeText(getApplicationContext(),"Passwords doesn't match",Toast.LENGTH_SHORT).show();
            return false;
        }
        preferences.putString("name",name);
        preferences.putString("email",email);
        preferences.putString("pass",pass);
        preferences.putString("school",school);
        preferences.putString("favthing",favThing);

        preferences.apply();
return true;
    }
}
