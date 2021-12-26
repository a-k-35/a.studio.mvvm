package com.example.akacalculatordesk;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<String> sonuc;

    public MainActivityViewModel() {
        sonuc = new MutableLiveData<String>("0");
    }
    public MutableLiveData<String> getSonuc() {
        return sonuc;
    }
}
