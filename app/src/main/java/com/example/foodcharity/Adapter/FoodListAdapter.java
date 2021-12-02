
package com.example.foodcharity.Adapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodcharity.FoodListActivity;
import com.example.foodcharity.Model.FoodModel;
import com.example.foodcharity.R;
import com.example.mychatapptutorial.ChatActivityMain;

import java.util.ArrayList;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.ViewHolder> {


    private ArrayList<FoodModel> arrayList;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    Context context;

    public FoodListAdapter(Context context, ArrayList<FoodModel> arrayList) {
        this.mInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.food_row_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        FoodModel o = arrayList.get(position);

        holder.foodname.setText(o.getName());
        holder.openChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ChatActivityMain.class);
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
        TextView foodname;
        CardView openChat;
        ViewHolder(View itemView) {
            super(itemView);

            foodname = itemView.findViewById(R.id.foodname);
            openChat = itemView.findViewById(R.id.openChat);

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