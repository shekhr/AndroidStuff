package com.mycodelabs.jsonparsing;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    public void onClick(View view) {

        ParseJson parseJson=new ParseJson();

    List<Contact> contactList=parseJson.jsonParsing();
        StringBuilder stringBuilder=new StringBuilder();
        if (!contactList.isEmpty()) {
        for (Contact contact : contactList){
            stringBuilder.append(contact.getName()).append(" , ").append(contact.getEmail()).append("\n");
        }
        textView.setText(stringBuilder.toString());
        textView.setBackgroundColor(Color.GREEN);
        textView.setTextColor(Color.GRAY);
    }
  }
}
