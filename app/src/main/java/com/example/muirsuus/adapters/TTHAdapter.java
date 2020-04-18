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

    private List<String> mLinks;
    IRecyclerViewClickListener clickListener;
    private OnTthListener mOnTthListener;

    public TTHAdapter(List<String> mLinks, OnTthListener onTthListener){
        this.mLinks = mLinks;
        this.mOnTthListener = onTthListener;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewGroup viewGroup;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_tth,parent,false);
        MyViewHolder vh = new MyViewHolder(v, mOnTthListener);
        return vh;
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.text.setText(mLinks.get(position));
    }

    @Override
    public int getItemCount() {
        return mLinks.size();
    }

    public static class  MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView image;
        public TextView text;
        public View layout;
        OnTthListener onTthListener;

        public MyViewHolder(@NonNull View itemView, OnTthListener onTthListener) {
            super(itemView);
            text = (TextView)itemView.findViewById(R.id.tth_text);
            this.onTthListener = onTthListener;

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            onTthListener.onTthClick(getAdapterPosition());

        }


    }
    public  interface  OnTthListener {
        void onTthClick(int position);
    }
}
