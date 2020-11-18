package com.example.feria_universidades.ui.profile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {
    private static LiveData<String> mText;


    public ProfileViewModel() {
        mText = new MutableLiveData<>();


    }

    public static LiveData<String> getText() {
        return mText;
    }
}