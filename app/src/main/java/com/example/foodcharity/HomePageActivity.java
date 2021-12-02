package com.example.foodcharity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomePageActivity extends AppCompatActivity {

    LinearLayout charity,restaurant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        charity = findViewById(R.id.charity);
        restaurant = findViewById(R.id.restaurant);

        charity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,LoginActivity.class);
                intent.putExtra("type","charity");
                startActivity(intent);
            }
        });

        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,LoginActivity.class);
                intent.putExtra("type","hotel");
                startActivity(intent);
            }
        });
    }
}