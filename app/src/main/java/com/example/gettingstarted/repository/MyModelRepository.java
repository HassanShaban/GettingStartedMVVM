package com.example.gettingstarted.repository;

import android.arch.lifecycle.MutableLiveData;

import com.example.gettingstarted.model.MyModel;

import java.util.ArrayList;

public class MyModelRepository  {

    ArrayList<MyModel> dataSet = new ArrayList<>();

   static  MyModelRepository myModelRepository ;


    public static MyModelRepository getInstance(){

        if(myModelRepository == null)
            return myModelRepository = new MyModelRepository();
        else
            return myModelRepository;

    }

    public MutableLiveData<ArrayList<MyModel>> getMyData(){

        setMyModel();
        MutableLiveData<ArrayList<MyModel>> data = new MutableLiveData<>();
        data.setValue(dataSet);
        return data;


    }

    private void setMyModel() {

        dataSet.add(new MyModel("hassan" , "Egypt"));
        dataSet.add(new MyModel("ahmed" , "Cairo"));
        dataSet.add(new MyModel("Moataz" , "Mnofia"));
        dataSet.add(new MyModel("samy" , "Alexandaria"));
        dataSet.add(new MyModel("ahmed" , "Cairo"));
        dataSet.add(new MyModel("Soad" , "Cairo"));
        dataSet.add(new MyModel("ahmed" , "Cairo"));
        dataSet.add(new MyModel("ahmed" , "Cairo"));
        dataSet.add(new MyModel("ahmed" , "Cairo"));
        dataSet.add(new MyModel("ahmed" , "Cairo"));


    }

}
