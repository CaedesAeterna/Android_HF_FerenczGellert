package com.example.labor_7_hw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class myAdapter extends ArrayAdapter {

    private Context context;

    private Integer[] imageList;

    private String[] currencySymbolList;
    private String[] currencyList;
    private String[] buyPriceList;
    private String[] sellPriceList;

    public myAdapter(Context context, String[] valutaSymbolList, String[] currencyList,
                     String[] buyPriceList, String[] sellPriceList, Integer[] imageList) {
        super(context, R.layout.one_currency, valutaSymbolList);
        this.context = context;
        this.currencySymbolList = valutaSymbolList;
        this.currencyList = currencyList;
        this.buyPriceList = buyPriceList;
        this.sellPriceList = sellPriceList;
        this.imageList = imageList;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.one_currency, parent, false);

        TextView currencySymbol = convertView.findViewById(R.id.currencySymbol);
        TextView currencyName = convertView.findViewById(R.id.currencyName);
        TextView buyPrice = convertView.findViewById(R.id.currencyBuyPrice);
        TextView sellPrice = convertView.findViewById(R.id.currencySellPrice);
        ImageView image = convertView.findViewById(R.id.countryFlag);

        currencySymbol.setText(currencySymbolList[position]);
        currencyName.setText(currencyList[position]);
        buyPrice.setText(buyPriceList[position]);
        sellPrice.setText(sellPriceList[position]);
        image.setImageResource(imageList[position]);


        return convertView;
    }
}
