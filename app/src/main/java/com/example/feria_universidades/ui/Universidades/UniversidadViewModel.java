package com.example.feria_universidades.ui.Universidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UniversidadViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UniversidadViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}