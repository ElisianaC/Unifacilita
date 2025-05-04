package com.example.unifacilita10;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private Context context;
    private String[] nomes;
    private int[] icones;
    private Class<?>[] activities;

    public HomeAdapter(Context context, String[] nomes, int[] icones, Class<?>[] activities) {
        this.context = context;
        this.nomes = nomes;
        this.icones = icones;
        this.activities = activities;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_opcao, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textTitle.setText(nomes[position]);
        holder.imageIcon.setImageResource(icones[position]);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, activities[position]);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return nomes.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textTitle;
        ImageView imageIcon;

        public MyViewHolder(View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textTitle);
            imageIcon = itemView.findViewById(R.id.imageIcon);
        }
    }
}