package com.example.foodcharity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class AddFoodActivity extends AppCompatActivity {
    EditText name,qauntity;
    String namrs,qauntitys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);
        name=findViewById(R.id.name);
        qauntity=findViewById(R.id.quantity);
    }
}