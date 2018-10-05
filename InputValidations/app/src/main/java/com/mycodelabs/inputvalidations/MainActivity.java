package com.mycodelabs.inputvalidations;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private EditText email;
    private EditText phone;
    private static TextView dateText;
    private EditText age;
    private static final int USERNAME=1;
    private static final int PASSWORD=2;
    private static final int AGE=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         username=(EditText)findViewById(R.id.usernameEdit);
         password=(EditText)findViewById(R.id.passwordEdit);
         email=(EditText)findViewById(R.id.emailEdit);
         phone=(EditText)findViewById(R.id.phoneEdit);
         dateText =(TextView)findViewById(R.id.dateEdit);
         age=(EditText)findViewById(R.id.ageEdit);
    }

    public void onClick(View view) {
        String name= username.getText().toString().trim();
        if (!name.isEmpty()){
            if(isSpecialCharacter(name,USERNAME)) //this method returns true if there is any special character in the username.
                username.setError("Special character found");
        }
        if(name.isEmpty()) // this method returns true if the username is empty.
            username.setError("Required field");

        String pass=password.getText().toString(); // getText() gets the password from the edit box and toString() method will convert the text into String datatype.
        if (!pass.isEmpty()) {
            if (isSpecialCharacter(pass, PASSWORD))
                password.setError("Do not use spaces");
        }
        if (pass.isEmpty())
            password.setError("Required field");

        String mail=email.getText().toString().trim();
        if (!mail.isEmpty()) {
            if(!isValidEmail(mail))
                email.setError("invalid email");
        }
        if(mail.isEmpty())
            email.setError("Required field");
        String number=phone.getText().toString().trim();
        if (!number.isEmpty()) {
            if(!isValidPhone(number))
                phone.setError("invalid Phone number");
        }
        if(number.isEmpty())
            phone.setError("Required field");



        String dateS= dateText.getText().toString().trim();
        if(dateS.isEmpty())
            dateText.setError("Required field");

        String ag=age.getText().toString().trim();
        if (!ag.isEmpty()) {
            if(isSpecialCharacter(ag,AGE))
                age.setError("invalid age");
        }
        if(ag.isEmpty())
            age.setError("Required field");


    }

    public void onDateClick(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }


    public boolean isValidEmail(String mail) {
       return android.util.Patterns.EMAIL_ADDRESS.matcher(mail).matches();
    }

    public boolean isValidPhone(String phone) {
       return   PhoneNumberUtils.isGlobalPhoneNumber(phone);
    }

    public boolean isSpecialCharacter(String s,int events) {
        if (s == null || s.trim().isEmpty()) {
            System.out.println("Incorrect format of string");
            return false;
        }
        Pattern p;
        switch (events){
            case 1: p = Pattern.compile("[^A-Za-z\\s\\.]"); /*Validating username with no special character but allowing spaces and dot(.)*/
                break;
            case 2: p = Pattern.compile("[^A-Za-z\\.]");    /*Validating password with no spaces*/
                break;
            case 3: p = Pattern.compile("[^0-9]");          /*Validating age with only numbers*/
                break;
            default:
                p= Pattern.compile("[^A-Za-z\\s\\.]");
                break;
        }

        Matcher m = p.matcher(s);

        return m.find();

    }

  public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current dateText as the default dateText in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            // Do something with the dateText chosen by the user
            dateText.setText(day + " - " + ++month + " - " + year);
        }
    }
}
