package com.example.gettingstarted.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.gettingstarted.model.MyModel;
import com.example.gettingstarted.repository.MyModelRepository;

import java.util.ArrayList;

public class MyViewModel extends ViewModel {

    MutableLiveData<ArrayList<MyModel>> nMyModel;
    MyModelRepository myModelRepository;

    public MutableLiveData<ArrayList<MyModel>> getnMyModel() {
        return nMyModel;
    }

    public void init(){

        if(nMyModel != null)
            return;

        myModelRepository = MyModelRepository.getInstance();

        nMyModel = myModelRepository.getMyData();

    }
}
