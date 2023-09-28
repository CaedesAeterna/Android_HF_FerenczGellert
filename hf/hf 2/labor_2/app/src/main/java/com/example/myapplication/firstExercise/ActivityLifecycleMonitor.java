package com.example.myapplication.firstExercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class ActivityLifecycleMonitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecyclemonitor);

        Button activity_two=findViewById(R.id.activity_two);

        activity_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startActivityTwo = new Intent(view.getContext(), ActivityTwo.class);
                startActivity(startActivityTwo);

            }
        });


    }





    @Override
    protected void onRestart() {
        super.onRestart();
        final String TAG = "ActivityLifecycleMonitor";
        Log.wtf(TAG,"On restart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        final String TAG = "ActivityLifecycleMonitor";
        Log.wtf(TAG,"On start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        final String TAG = "ActivityLifecycleMonitor";
        Log.wtf(TAG,"On resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        final String TAG = "ActivityLifecycleMonitor";
        Log.wtf(TAG,"On pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        final String TAG = "ActivityLifecycleMonitor";
        Log.wtf(TAG,"On stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        final String TAG = "ActivityLifecycleMonitor";
        Log.wtf(TAG,"On destroy");
    }


}