package com.example.newandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: invoked");


        /*Log.i(TAG, "onCreate: I am here.application loader");
        int x=5;
        if(x<6){
            Log.d(TAG, "onCreate: x is less than 6");
        }else{
            Log.i(TAG, "onCreate: x is grater than 6");
        }*/
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "onStart: this is invoked");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        
        super.onRestart();
        Log.i(TAG, "onRestart: invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: invoked");
    }
}