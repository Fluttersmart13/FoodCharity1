package com.example.foodcharity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
//                SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
//                String loginValue = prefs.getString("loginValue", "");
//
//                if(loginValue.equalsIgnoreCase("yes")){
//                    Intent intent=new Intent(MainActivity.this,HomePageActivity.class);
//                    startActivity(intent);
//                } else {
//                    Intent intent=new Intent(MainActivity.this,LoginActivity.class);
//                    startActivity(intent);
//                }

                Intent intent=new Intent(MainActivity.this, HomePageActivity.class);
                startActivity(intent);

                finish();
            }
        }, 3000);
    }


}