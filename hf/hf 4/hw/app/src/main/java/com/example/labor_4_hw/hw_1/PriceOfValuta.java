package com.example.labor_4_hw.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.labor_4_hw.R;

public class PriceOfValuta extends AppCompatActivity {

    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_of_valuta);

        myList = findViewById(R.id.myList);

        String[] valutaSymbolList = getResources().getStringArray(R.array.currencySymbolList);
        String[] valutaList = getResources().getStringArray(R.array.currencyList);
        String[] buyPriceList = getResources().getStringArray(R.array.buyPriceList);
        String[] sellPriceList = getResources().getStringArray(R.array.sellPriceList);

        Integer[] imageList = {
                R.drawable.usa,
                R.drawable.europe,
                R.drawable.greatbritain
        };

        myAdapter myAdapter = new myAdapter(this, valutaSymbolList, valutaList,
                buyPriceList, sellPriceList, imageList);


        myList.setAdapter(myAdapter);
    }
}