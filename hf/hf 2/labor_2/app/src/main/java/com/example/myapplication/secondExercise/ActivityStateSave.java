package com.example.myapplication.secondExercise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;

public class ActivityStateSave extends AppCompatActivity {

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        final String TAG = "ActivityStateSave";

        Log.wtf(TAG,"Inside save intance");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        final String TAG = "ActivityStateSave";
        Log.wtf(TAG,"Inside restore intance");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_save);

        TextView clickable_textView = findViewById(R.id.clickable_textView);

        clickable_textView.setOnClickListener(new View.OnClickListener() {
            int i = 0;

            @Override
            public void onClick(View view) {
                i++;
                clickable_textView.setText("clicked " + i+" times");

            }



        });

    }
}