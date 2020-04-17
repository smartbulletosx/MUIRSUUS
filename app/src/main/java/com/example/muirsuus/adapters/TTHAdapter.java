package com.example.muirsuus.adapters;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.muirsuus.CardClass;
import com.example.muirsuus.IRecyclerViewClickListener;
import com.example.muirsuus.R;

import java.util.List;

public class TTHAdapter extends RecyclerView.Adapter<TTHAdapter.MyViewHolder> {

    private List<CardClass> mLinks;
    IRecyclerViewClickListener clickListener;

    public TTHAdapter(List<CardClass> mLinks){this.mLinks = mLinks;}



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewGroup viewGroup;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_tth,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.text.setText(mLinks.get(position).getTitle());
        holder.image.setImageResource(mLinks.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return mLinks.size();
    }

    public static class  MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView image;
        public TextView text;
        public View layout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.tth_image);
            text = (TextView)itemView.findViewById(R.id.tth_text);

        }
    }
}
