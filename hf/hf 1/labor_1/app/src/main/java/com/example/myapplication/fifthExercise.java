package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fifthExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_exercise);


        Button calc2 = findViewById(R.id.calc2);
        Button calc3 = findViewById(R.id.calc3);
        Button calc4 = findViewById(R.id.calc4);
        Button calc5 = findViewById(R.id.calc5);
        EditText number1 = findViewById(R.id.editTextNumber3);
        EditText number2 = findViewById(R.id.editTextNumber4);
        TextView textView2 = findViewById(R.id.textView2);

        calc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int out = Integer.parseInt(number1.getText().toString()) +
                        Integer.parseInt(number2.getText().toString());

                textView2.setText(String.valueOf(out));

            }
        });
        calc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double out = Double.parseDouble(number1.getText().toString()) /
                            Double.parseDouble(number2.getText().toString());
                    textView2.setText(String.valueOf(out));

                } catch (ArithmeticException x) {
                    System.out.println("Divison by zero");
                }


            }
        });
        calc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int out = Integer.parseInt(number1.getText().toString()) -
                        Integer.parseInt(number2.getText().toString());

                textView2.setText(String.valueOf(out));

            }
        });
        calc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int out = Integer.parseInt(number1.getText().toString()) *
                        Integer.parseInt(number2.getText().toString());

                textView2.setText(String.valueOf(out));

            }
        });


    }
}