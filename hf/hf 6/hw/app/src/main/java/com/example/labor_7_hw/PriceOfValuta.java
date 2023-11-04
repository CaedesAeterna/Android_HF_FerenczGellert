package com.example.labor_7_hw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ListView;

public class PriceOfValuta extends AppCompatActivity {
    private static final String FRAG1 = "1";
    private static final String FRAG2 = "2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_of_valuta);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentTransaction.add(R.id.fragmentContainerView, new firstFragment(), FRAG1);
            fragmentTransaction.add(R.id.fragmentContainerView2, new secondFragment(), FRAG2);
        } else {
            if (fragmentManager.findFragmentByTag(FRAG2) != null)
                fragmentTransaction.remove(fragmentManager.findFragmentByTag(FRAG2));
            fragmentTransaction.add(R.id.fragmentContainerView, new firstFragment(), FRAG1);
        }


        fragmentTransaction.commit();
    }
}