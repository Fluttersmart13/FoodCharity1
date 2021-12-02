package com.example.foodcharity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodcharity.Adapter.FoodListAdapter;
import com.example.foodcharity.Adapter.HotelListListAdapter;
import com.example.foodcharity.Model.FoodModel;
import com.example.foodcharity.Model.HotelModel;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {
    ArrayList<FoodModel> arrayList;
    Context context = this;
    FoodListAdapter adapter;
    RecyclerView recyclerView;
    CardView addcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        arrayList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        addcard = findViewById(R.id.addcard);


        FoodModel foodModel = new FoodModel();
        foodModel.setName("Daal Rice");

        FoodModel foodModel1 = new FoodModel();
        foodModel1.setName("Chole bhature");

        FoodModel foodMode2 = new FoodModel();
        foodMode2.setName("Daal baati churma");
        arrayList.add(foodModel);
        arrayList.add(foodModel1);
        arrayList.add(foodMode2);


        addcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodListActivity.this,AddFoodActivity.class);
                startActivity(intent);
            }
        });
        adapter = new FoodListAdapter(FoodListActivity.this,arrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}