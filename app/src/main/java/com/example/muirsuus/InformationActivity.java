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

    private String[] titles = {
            "ТТХ средств связи",
            "ТТХ вооружения",
            "ТТХ автомобильной и бронетехники",
            "ТТХ средств РХБЗ",
            "ТТХ инженерных средств",
            "Оперативно-техническая служба",
            "Сетевой инженер",
            "Подготовка",
            "Нормативно-правовая база",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
    }
}
