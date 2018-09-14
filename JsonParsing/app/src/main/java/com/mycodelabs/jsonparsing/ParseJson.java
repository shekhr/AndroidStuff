package com.mycodelabs.jsonparsing;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shekharc on 22-Jun-16.
 */
public class ParseJson {
    private static final String CONTACTS = "contacts";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final String ADDRESS = "address";
    private static final String GENDER = "gender";
    private static final String PHONE = "phone";
    private static final String PHONE_MOBILE = "mobile";
    private static final String PHONE_HOME = "home";
    private static final String PHONE_OFFICE = "office";


    public List<Contact> jsonParsing(){

        String jsonStr=ConstantJson.json;
        List<Contact> contactList = new ArrayList<>();
        if (jsonStr != null) {
            try {
                JSONObject jsonObj = new JSONObject(jsonStr);

                // Getting JSON Array node
                JSONArray contacts = jsonObj.getJSONArray(CONTACTS);

                // looping through All Contacts
                Contact contact;
                for (int i = 0; i < contacts.length(); i++) {
                    contact=new Contact();
                    JSONObject c = contacts.getJSONObject(i);

                    contact.setId(c.optString(ID));
                    contact.setName( c.optString(NAME));
                    contact.setEmail(c.optString(EMAIL));
                    contact.setGender(c.optString(GENDER));
                    contact.setAddress(c.optString(ADDRESS));

                    // Phone node is JSON Object
                    JSONObject phone = c.getJSONObject(PHONE);
                    contact.setMobile(phone.optString(PHONE_MOBILE));
                    contact.setHome(phone.optString(PHONE_HOME));
                    contact.setOffice(phone.optString(PHONE_OFFICE));

                    contactList.add(contact);

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return contactList;
        }

       return contactList;
    }
}
