package com.example.labor_7_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedItem = extras.getString("item");

            TextView currencyName = findViewById(R.id.selectedCurrencyName);

            currencyName.setText("This is the currency name: " + selectedItem);

        }
    }

}