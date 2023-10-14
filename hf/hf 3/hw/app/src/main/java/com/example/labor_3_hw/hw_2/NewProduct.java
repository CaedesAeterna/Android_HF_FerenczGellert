package com.example.labor_3_hw.hw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.labor_3_hw.R;

import java.util.ArrayList;
import java.util.List;

public class NewProduct extends AppCompatActivity {

    ListView myListView;
    ArrayList<Product> products = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_product);


        myListView = findViewById(R.id.myList);
        Button addButton = findViewById(R.id.button2);
        Button cancelButton = findViewById(R.id.button3);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String productName = ((EditText) findViewById(R.id.editTextText2)).getText().toString();
                String productPrice = ((EditText) findViewById(R.id.editTextText5)).getText().toString();
                String productCode = ((EditText) findViewById(R.id.editTextText6)).getText().toString();


                Product product = new Product(productName, productPrice, productCode);

                products.add(product);

                EditText productNameEditText = findViewById(R.id.editTextText2);
                EditText productPriceEditText = findViewById(R.id.editTextText5);
                EditText productCodeEditText = findViewById(R.id.editTextText6);

                productCodeEditText.setText("");
                productNameEditText.setText("");
                productPriceEditText.setText("");

                myListView.setAdapter(new ArrayAdapter<Product>((Context) NewProduct.this,
                        android.R.layout.simple_list_item_1, products));


            }
        });


    }

    public class Product {
        private String productName;
        private String productPrice;
        private String productCode;

        public Product(String productName, String productPrice, String productCode) {
            this.productName = productName;
            this.productPrice = productPrice;
            this.productCode = productCode;
        }

        @Override
        public String toString() {
            return "productName='" + this.productName + '\'' +
                    ", productPrice='" + this.productPrice + '\'' +
                    ", productCode='" + this.productCode + '\'';
        }
    }
}