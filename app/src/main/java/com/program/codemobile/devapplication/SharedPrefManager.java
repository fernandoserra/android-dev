package com.program.codemobile.devapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class SharedPrefManager {

    private static final String TAG = "SharedPrefManager" ;
    private  static final String SHARED_PREF_NAME="demoDev";
    private  static final String CART_ID    ="CART_ID";
    private  static final String CUSTOMER_ID="CUSTOMER_ID";
    private  static Context mCtx;
    private  static SharedPrefManager mInstance;

    private SharedPrefManager(Context context){
        mCtx =context;
    }

    public static synchronized SharedPrefManager getInstance(Context context){
        if(mInstance==null){
            mInstance = new SharedPrefManager(context);
        }
        return  mInstance;
    }

    public boolean storeCard(String card_id , String customer_id){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(CART_ID,card_id);
        editor.putString(CUSTOMER_ID,customer_id);
        editor.apply();
        return true;
    }

    public String getCardID(){
        SharedPreferences  sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getString(CART_ID,null);
    }

    public String getCustomeID(){
        SharedPreferences  sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getString(CUSTOMER_ID,null);
    }

    public void clearSharedPreferences() {
        SharedPreferences  sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        sharedPreferences.edit().remove(CART_ID).apply();
        sharedPreferences.edit().remove(CUSTOMER_ID).apply();
    }

}