package com.example.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {
    Context context;
    ArrayList<Apps> app;

    public Myadapter(Context context, ArrayList<Apps> app) {
        this.context = context;
        this.app = app;
    }
    @NonNull
    @NotNull
    @Override
    public Myadapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
      LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
      View view = layoutInflater.inflate(R.layout.list_item,parent,false);
      ViewHolder vh = new ViewHolder(view);
      return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Myadapter.ViewHolder holder, int position) {
        Apps apps = app.get(position);
        holder.txt.setText(apps.getApps());
        holder.txt1.setText(apps.getDes());
        holder.remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.remove(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return app.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
     public TextView txt;
       public TextView txt1;
       public Button remove;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.remove=(Button)itemView.findViewById(R.id.remove);
            this.txt=(TextView)itemView.findViewById(R.id.text1);
            this.txt1=(TextView)itemView.findViewById(R.id.text2);
        }
    }

    }


