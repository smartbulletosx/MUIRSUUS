package com.example.muirsuus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.muirsuus.adapters.TTHAdapter;

import java.util.ArrayList;
import java.util.List;

public class TTHActivity extends AppCompatActivity implements TTHAdapter.OnTthListener {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private TTHAdapter adapter;
    private final List<String> SCHEMES = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tth_activity);

        SCHEMES.add("ТТХ средств связи");
        SCHEMES.add("ТТХ вооружения");
        SCHEMES.add("ТТХ АВ и БТ техники");
        SCHEMES.add("ТТХ средств РХБЗ");
        SCHEMES.add("ТТХ инженерных средств");
        SCHEMES.add("Оперативно-техническая служба");
        SCHEMES.add("Сетевой инженер");
        SCHEMES.add("Пдготовка");
        SCHEMES.add("Нормативно - правовая база");

        mRecyclerView = (RecyclerView)findViewById(R.id.tth_recycler);
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);


        StartAdapter();


    }

    public void StartAdapter(){

        adapter = new TTHAdapter(SCHEMES, this);
        mRecyclerView.setAdapter(adapter);
    }

    final  String LOG = "MyLogs";
    @Override
    public void onTthClick(int position) {

        Intent intent = new Intent(TTHActivity.this, MeansOfCommunication.class);
        intent.putExtra("name", position);
        Log.d(LOG, "startActivity");
        startActivity(intent);
    }
}
