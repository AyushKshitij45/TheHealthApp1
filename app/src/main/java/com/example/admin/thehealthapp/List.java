package com.example.admin.thehealthapp;

/**
 * Created by admin on 9/4/2017.
 */

public class List {

    private String mDiseaseName;
    private String mPersonStatus;

    public List(String diseaseName,String personStatus){
        mDiseaseName=diseaseName;
        mPersonStatus=personStatus;
    }

    public String getDiseaseName(){
        return mDiseaseName;
    }

    public String getPersonStatus(){
        return mPersonStatus;
    }

}
