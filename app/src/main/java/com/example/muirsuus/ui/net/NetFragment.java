package com.example.muirsuus.ui.net;

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


public class NetFragment extends Fragment {
    private NetViewModel netViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        netViewModel =
                ViewModelProviders.of(this).get(NetViewModel.class);
        View root = inflater.inflate(R.layout.fragment_net,container,false);
        final TextView textView = root.findViewById(R.id.text_net);
        netViewModel.getText().observe(getViewLifecycleOwner(),new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
