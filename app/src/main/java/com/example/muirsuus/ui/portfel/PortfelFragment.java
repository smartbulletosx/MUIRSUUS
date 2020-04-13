package com.example.muirsuus.ui.portfel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.muirsuus.R;
import com.example.muirsuus.ui.lit.LitViewModel;

public class PortfelFragment extends Fragment {
    private PortfelViewModel portfelViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        portfelViewModel =
                ViewModelProviders.of(this).get(PortfelViewModel.class);
        View root = inflater.inflate(R.layout.fragment_portfel,container,false);
        final TextView textView = root.findViewById(R.id.text_portfel);
        portfelViewModel.getText().observe(getViewLifecycleOwner(),new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
