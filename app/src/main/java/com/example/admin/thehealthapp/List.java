package com.example.admin.thehealthapp;

/**
 * Created by admin on 9/4/2017.
 */

public class List {

    private String mDiseaseName;
    private String mPersonStatus;
    private int mImageResourceId;

    public List(String diseaseName,String personStatus,int imageResourceId){
        mDiseaseName=diseaseName;
        mPersonStatus=personStatus;
        mImageResourceId = imageResourceId;

    }

    public String getDiseaseName(){
        return mDiseaseName;
    }

    public String getPersonStatus(){
        return mPersonStatus;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
