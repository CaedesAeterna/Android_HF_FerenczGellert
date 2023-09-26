package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fourthExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_exercise);

        EditText number1 = findViewById(R.id.editTextNumber1);
        EditText number2 = findViewById(R.id.editTextNumber2);
        TextView textView1 = findViewById(R.id.textView1);
        Button calc = findViewById(R.id.calc);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int out = Integer.parseInt(number1.getText().toString()) +
                        Integer.parseInt(number2.getText().toString());

                textView1.setText(String.valueOf(out));


            }
        });


    }
}