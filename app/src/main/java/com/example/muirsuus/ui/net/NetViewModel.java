package com.example.muirsuus.ui.net;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NetViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public NetViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is network page");
    }

    public LiveData<String> getText() {return mText;}
}
