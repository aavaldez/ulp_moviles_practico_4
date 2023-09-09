package com.a2valdez.ulp_moviles_practico_4.ui.llamar;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LlamarViewModel extends AndroidViewModel {

    private final MutableLiveData<String> mText;

    private Context context;

    public LlamarViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
        context = application.getApplicationContext();
    }

    public LiveData<String> getMText() {
        return mText;
    }

    public void llamar(String numero){
        mText.setValue("");
        if(numero.equals("")){
            mText.setValue("ERROR EL NUMERO INGRESADO NO ES VÁLIDO");
        } else{
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+ numero));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            try{
                context.startActivity(intent);
            } catch(Exception e){
                mText.setValue("ERROR: NO TIENE PERMISOS");
            }
        }
    }
}