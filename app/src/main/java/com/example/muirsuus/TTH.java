package com.example.muirsuus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.muirsuus.adapters.StartAdapter;
import com.example.muirsuus.adapters.TTHAdapter;

import java.util.ArrayList;
import java.util.List;

public class TTH extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private TTHAdapter adapter;
    private final List<CardClass> SCHEMES = new ArrayList<CardClass>();
    final static public int[] layouts = {R.layout.activity_main1,R.layout.activity_main2,R.layout.activity_main3,R.layout.activity_main4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tth_activity);

        SCHEMES.add(new CardClass(R.drawable.ic_1,"Средства связи"));
        SCHEMES.add(new CardClass(R.drawable.ic_2,"Аппаратные"));
        SCHEMES.add(new CardClass(R.drawable.ic_3,"Документы ОТС"));
        SCHEMES.add(new CardClass(R.drawable.ic_4,"История"));

        mRecyclerView = (RecyclerView)findViewById(R.id.tth_recycler);
        mRecyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        //--------------------------------------------
        //------------------------------------
        //title = (TextView)findViewById(R.id.tvStartActivity);
        //------------------------------------
        StartAdapter();


    }

    public void StartAdapter(){

        //List<String> photoLinks = GetLinkImages(NAME_OF_SCHEME);
        //final String photoLinksStr[] = photoLinks.toArray(new String[0]);

//-----------------------------------------------------------------------------
        final IRecyclerViewClickListener listener = new IRecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                i.putExtra("POSITION",position);
                i.putExtra("layout",layouts[position]);
                startActivity(i);
            }
        };
//-----------------------------------------------------------------------------
        adapter = new TTHAdapter(SCHEMES);
        mRecyclerView.setAdapter(adapter);
        //mRecyclerView.scrollToPosition(1);
    }
}
