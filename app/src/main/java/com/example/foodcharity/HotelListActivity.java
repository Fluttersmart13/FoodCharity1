package com.example.foodcharity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.foodcharity.Adapter.HotelListListAdapter;
import com.example.foodcharity.Model.HotelModel;

import java.util.ArrayList;

public class HotelListActivity extends AppCompatActivity {
    ArrayList<HotelModel> arrayList;
    Context context = this;
    HotelListListAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        arrayList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);


        HotelModel hotelModel = new HotelModel();
        hotelModel.setName("Sai Kripa");
        hotelModel.setAvalable("0");
        hotelModel.setRating("0.6");

        HotelModel hotelModel1 = new HotelModel();
        hotelModel1.setName("Rathe krishna");
        hotelModel1.setAvalable("1");
        hotelModel1.setRating("8");

        HotelModel hotelModel2 = new HotelModel();
        hotelModel2.setName("Abhi nandan");
        hotelModel2.setAvalable("1");
        hotelModel2.setRating("4.5");


        HotelModel hotelModel3 = new HotelModel();
        hotelModel3.setName("Tip top 5");
        hotelModel3.setAvalable("0");
        hotelModel3.setRating("6");
        arrayList.add(hotelModel);
        arrayList.add(hotelModel1);
        arrayList.add(hotelModel2);
        arrayList.add(hotelModel3);
        arrayList.add(hotelModel);

        adapter = new HotelListListAdapter(HotelListActivity.this,arrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}