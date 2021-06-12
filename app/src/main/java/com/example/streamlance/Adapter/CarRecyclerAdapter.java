package com.example.streamlance.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.streamlance.Fragments.Bottom_Sheet;
import com.example.streamlance.Models.Cars;
import com.example.streamlance.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CarRecyclerAdapter extends RecyclerView.Adapter<CarRecyclerAdapter.ViewHolder> {
    ArrayList<Cars> list;
    Context context;
    Bottom_Sheet bottom_sheet;

    public CarRecyclerAdapter(ArrayList<Cars> list, Context context) {

        this.list = list;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public CarRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_cars, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CarRecyclerAdapter.ViewHolder holder, int position) {
        final Cars cars = list.get(position);
        holder.carname.setText(cars.getCarName());
        holder.carmodel.setText(cars.getCarModel());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                intent.putExtra("carname",cars.getCarName());
                intent.putExtra("carmodel",cars.getCarModel());
                intent.putExtra("carpic",cars.getCarpic());
                context.startActivity(intent);*/

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView carimage;
        TextView carname,carmodel;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            carimage=itemView.findViewById(R.id.carpic);
            carname=itemView.findViewById(R.id.carname);
            carmodel=itemView.findViewById(R.id.chesisno);
        }
    }
}

