package com.example.myapplication.firstExercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Button start_main = findViewById(R.id.start_main);
        Button start_third = findViewById(R.id.start_third);


        start_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startMain = new Intent(view.getContext(), ActivityLifecycleMonitor.class);
                startActivity(startMain);

            }
        });

        start_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startThird = new Intent(view.getContext(), ActivityThree.class);
                startActivity(startThird);

            }
        });

    }
}