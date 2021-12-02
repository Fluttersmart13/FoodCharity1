package com.example.foodcharity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    LinearLayout linear2,linerbtn,registerbtn,linear1;
    TextView signup;
    Button loginbtn;
    String type,names,passwords;
    EditText name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = findViewById(R.id.signup);
        loginbtn = findViewById(R.id.loginbtn);
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);

        Intent intent = getIntent();
        type = intent.getStringExtra("type");

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equalsIgnoreCase("charity")){
                    Intent intent = new Intent(LoginActivity.this, RegitrationCharity.class);
                    intent.putExtra("type","charity");
                    startActivity(intent);
                }
                if(type.equalsIgnoreCase("hotel")){
                    Intent intent = new Intent(LoginActivity.this, RegistrationHotel.class);
                    intent.putExtra("type","hotel");
                    startActivity(intent);
                }
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equalsIgnoreCase("charity")){
                    Intent intent = new Intent(LoginActivity.this, HotelListActivity.class);
                    startActivity(intent);
                }
                if(type.equalsIgnoreCase("hotel")){
                    Intent intent = new Intent(LoginActivity.this,FoodListActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}