package com.example.econinja.ui.reward;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RewardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RewardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Rewards catalogue");
    }

    public LiveData<String> getText() {
        return mText;
    }
}