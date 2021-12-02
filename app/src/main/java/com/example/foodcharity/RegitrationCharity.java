package com.example.foodcharity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegitrationCharity extends AppCompatActivity {

    TextView loginbtn;
    String type;

    EditText name,charity,contact,password;
    String names,charitys,contacts,passwords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiter);

        name = findViewById(R.id.name);
        charity = findViewById(R.id.charity);
        contact = findViewById(R.id.contact);
        password = findViewById(R.id.password);

        loginbtn = findViewById(R.id.loginbtn);
        Intent intent = getIntent();
        type = intent.getStringExtra("type");
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegitrationCharity.this,LoginActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
    }
}