
package com.example.foodcharity.Adapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodcharity.FoodListActivity;
import com.example.foodcharity.Model.FoodModel;
import com.example.foodcharity.Model.HotelModel;
import com.example.foodcharity.R;

import java.util.ArrayList;

public class HotelListListAdapter extends RecyclerView.Adapter<HotelListListAdapter.ViewHolder> {
    ArrayList<HotelModel> arrayList;
    private ItemClickListener mClickListener;
    Context context;
    private LayoutInflater mInflater;

    public HotelListListAdapter(Context context, ArrayList<HotelModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.hotel_row_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        HotelModel o = arrayList.get(position);

        float rate = Float.parseFloat(o.getRating());
        holder.hotelname.setText(o.getName());

        holder.ratingBar.setRating(rate);
        if(o.getAvalable().equalsIgnoreCase("0")){
            holder.avlibility.setText(" NA");
            holder.card_avlibility.setCardBackgroundColor(Color.parseColor("#F44336"));

        }else if(o.getAvalable().equalsIgnoreCase("1")){
            holder.avlibility.setText(" Available ");
            holder.card_avlibility.setCardBackgroundColor(Color.parseColor("#4CAF50"));
        }

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FoodListActivity.class);
                context.startActivity(intent);
            }
        });
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView hotelname,avlibility;
        CardView card_avlibility,card;
        RatingBar ratingBar;
        ViewHolder(View itemView) {
            super(itemView);
            hotelname = itemView.findViewById(R.id.hotelname);
            avlibility = itemView.findViewById(R.id.avlibility);
            card = itemView.findViewById(R.id.card);
            card_avlibility = itemView.findViewById(R.id.card_avlibility);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}