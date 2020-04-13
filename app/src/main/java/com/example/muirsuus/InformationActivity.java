package com.example.muirsuus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.example.muirsuus.adapters.InformAdapter;
import com.example.muirsuus.adapters.StartAdapter;

import java.util.ArrayList;
import java.util.List;

public class InformationActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private InformAdapter adapter;
    final public List<CardClass> SCHEMES = new ArrayList<CardClass>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
    }
}
