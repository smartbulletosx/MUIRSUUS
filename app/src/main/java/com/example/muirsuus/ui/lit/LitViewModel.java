package com.example.muirsuus.ui.lit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LitViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public LitViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is literature page");
    }

    public LiveData<String> getText() {return mText;}
}
