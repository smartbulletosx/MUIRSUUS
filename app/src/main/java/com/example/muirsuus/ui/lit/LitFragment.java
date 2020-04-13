package com.example.muirsuus.ui.lit;

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

public class LitFragment extends Fragment {

    private LitViewModel litViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
         litViewModel =
                ViewModelProviders.of(this).get(LitViewModel.class);
         View root = inflater.inflate(R.layout.fragment_lit,container,false);
         final TextView textView = root.findViewById(R.id.text_lit);
         litViewModel.getText().observe(getViewLifecycleOwner(),new Observer<String>() {
             @Override
             public void onChanged(@Nullable String s) {
                 textView.setText(s);
             }
         });
         return root;
    }
}
