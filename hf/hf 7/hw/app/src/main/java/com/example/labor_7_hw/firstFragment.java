package com.example.labor_7_hw;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link firstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class firstFragment extends Fragment {
    ListView myList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    protected static final String FRAG2 = "2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public firstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment firstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static firstFragment newInstance(String param1, String param2) {
        firstFragment fragment = new firstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        Context context = getActivity().getApplicationContext();

        myList = view.findViewById(R.id.myList);

        String[] valutaSymbolList = getResources().getStringArray(R.array.currencySymbolList);
        String[] valutaList = getResources().getStringArray(R.array.currencyList);
        String[] buyPriceList = getResources().getStringArray(R.array.buyPriceList);
        String[] sellPriceList = getResources().getStringArray(R.array.sellPriceList);

        Integer[] imageList = {
                R.drawable.usa,
                R.drawable.europe,
                R.drawable.greatbritain
        };


        final String[] currencyList = {"USD", "EURO", "POUND"};

//        myAdapter myAdapter = new myAdapter(this.getContext(), valutaSymbolList, valutaList,
//                buyPriceList, sellPriceList, imageList);

        myList.setAdapter(
                new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, currencyList));

        FragmentManager fragmentManager = getParentFragmentManager();

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (fragmentManager.findFragmentByTag(FRAG2) != null) {

                    TextView textView = getActivity().findViewById(R.id.currencyName);
                    textView.setText("This is the currency name: " + (textView.getText().toString()));

                } else {

                    Intent intent = new Intent(getActivity().getApplicationContext(), ShowItemActivity.class);
                    intent.putExtra("item", ((TextView) view).getText().toString());
                    startActivity(intent);

                }
            }
        });


        return view;
    }
}