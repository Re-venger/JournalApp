package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {


    Context context;
    ArrayList<ContactModel> arrlist;
    
    RecyclerContactAdapter(Context context , ArrayList<ContactModel> arrlist){
        this.context = context;
        this.arrlist = arrlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.contact_row,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.name.setText(arrlist.get(i).name);
        viewHolder.number.setText(arrlist.get(i).number);
        viewHolder.img.setImageResource(arrlist.get(i).image);
    }


    @Override
    public int getItemCount() {
        return arrlist.size();
    }

    TextView name,number;
    ImageView img;
    public class ViewHolder extends RecyclerView.ViewHolder{
        
        public ViewHolder(View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);
            img = itemView.findViewById(R.id.icon);
        }
    }
}
