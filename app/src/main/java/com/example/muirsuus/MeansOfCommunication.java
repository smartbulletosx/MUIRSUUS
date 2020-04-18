package com.example.muirsuus;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.muirsuus.adapters.TTHAdapter;

import java.util.ArrayList;
import java.util.List;

public class MeansOfCommunication extends AppCompatActivity implements TTHAdapter.OnTthListener {
    final  String LOG = "MyLogs";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private TTHAdapter adapter;
    private final List<String> SCHEMES = new ArrayList<String>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.means_of_communication_layout);

        TextView textView = findViewById(R.id.text_of_previous);

        Intent intent = getIntent();
        int name = intent.getIntExtra("name", 0);

        textView.setText(Integer.toString(name));

        switch (name){
            case 0:
                SCHEMES.add("КШМ");
                SCHEMES.add("КАС");
                SCHEMES.add("Аппаратные КО");
                SCHEMES.add("РРС");
                SCHEMES.add("ТРС");
                SCHEMES.add("ССС");
                SCHEMES.add("РС");
                SCHEMES.add("Аппаратные ТОС и АСУ");
                SCHEMES.add("Аппаратные ФПС");
                SCHEMES.add("Аппаратные управления");
                SCHEMES.add("Аппаратные электропитания");
                SCHEMES.add("Кабели связи");
                SCHEMES.add("Другие средства связи");
                break;
            case 1:
                SCHEMES.add("Пистолеты");
                SCHEMES.add("Автоматы");
                SCHEMES.add("Гранотомёты");
                SCHEMES.add("Гранаты");
                break;
            case 2:
                SCHEMES.add("Автомобильная техника");
                SCHEMES.add("Бронированная техника");
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                SCHEMES.add("Руководящая документация");
                break;
            case 6:
                SCHEMES.add("Инструменты для монтажа");
                SCHEMES.add("Монтажные работы");
                SCHEMES.add("Линии связи");
                SCHEMES.add("Сетевые протоколы");
                SCHEMES.add("Порты TCP и UDP");
                SCHEMES.add("Сетевое оборудование");
                SCHEMES.add("Электрика");
                SCHEMES.add("Электроника");
                break;
            case 7:
                SCHEMES.add("ТСП");
                SCHEMES.add("Топография");
                SCHEMES.add("Огневая");
                SCHEMES.add("Медицинская");
                SCHEMES.add("Инженерная");
                break;
            case 8:
                break;
        }

        mRecyclerView = (RecyclerView)findViewById(R.id.point_recycler);
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        StartAdapter();
    }

    private void StartAdapter() {
        adapter = new TTHAdapter(SCHEMES, this);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onTthClick(int position) {

    }
}
