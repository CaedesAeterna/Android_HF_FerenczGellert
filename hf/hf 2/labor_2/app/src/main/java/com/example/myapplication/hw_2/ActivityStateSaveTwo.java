package com.example.myapplication.hw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.R;

public class ActivityStateSaveTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_save_two);



    }

    @Override
    protected void onStart() {
        super.onStart();
        final String TAG = "ActivityStateSaveTwo";
        Log.wtf(TAG,"On start");

    }

    @Override
    protected void onStop() {
        super.onStop();
        final String TAG = "ActivityStateSaveTwo";
        Log.wtf(TAG,"On stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        final String TAG = "ActivityStateSaveTwo";
        Log.wtf(TAG,"On destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        final String TAG = "ActivityStateSaveTwo";
        Log.wtf(TAG,"On pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        final String TAG = "ActivityStateSaveTwo";
        Log.wtf(TAG,"On resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        final String TAG = "ActivityStateSaveTwo";
        Log.wtf(TAG,"On restart");
    }
}