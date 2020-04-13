package com.example.muirsuus.ui.portfel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PortfelViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PortfelViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is portfel page");
    }

    public LiveData<String> getText() {return mText;}
}
