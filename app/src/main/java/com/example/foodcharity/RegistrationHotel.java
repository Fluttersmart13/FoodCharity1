package com.example.foodcharity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationHotel extends AppCompatActivity {
    TextView loginbtn;
    EditText name,hotelname,contact,password;
    String names,hotelnames,contacts,passwords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_hotel);

        loginbtn = findViewById(R.id.loginbtn);
        name = findViewById(R.id.name);
        hotelname = findViewById(R.id.hotelname);
        contact = findViewById(R.id.contact);
        password = findViewById(R.id.password);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}