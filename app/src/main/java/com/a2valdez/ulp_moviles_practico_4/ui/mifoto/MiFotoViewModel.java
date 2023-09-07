package com.a2valdez.ulp_moviles_practico_4.ui.mifoto;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MiFotoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MiFotoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}