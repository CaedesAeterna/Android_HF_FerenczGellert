package com.example.labor_5_hw.firstHomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.labor_5_hw.R;

import java.util.List;

public class firstHomework extends AppCompatActivity {

    ArrayAdapter adapter;
    ListView myList;

    String[] listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_homework);

        myList = findViewById(R.id.myList);

        listItems = getResources().getStringArray(R.array.texts);

        adapter = new ArrayAdapter(this, R.layout.one_string, R.id.textView, listItems);
        myList.setAdapter(adapter);


        registerForContextMenu(myList);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu, menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info =
                (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int id = info.position;
        View itemView = info.targetView;

        if (item.getItemId() == R.id.red) {
            ((TextView) itemView.findViewById(R.id.textView))
                    .setTextColor(getResources().getColor(R.color.red));

//            itemView.setBackgroundColor(getResources().getColor(R.color.red));
//            adapter.notifyDataSetChanged();
        } else if (item.getItemId() == R.id.yellow) {
            ((TextView) itemView.findViewById(R.id.textView))
                    .setTextColor(getResources().getColor(R.color.yellow));

//            itemView.setBackgroundColor(getResources().getColor(R.color.yellow));
//            adapter.notifyDataSetChanged();
        } else if (item.getItemId() == R.id.green) {
            ((TextView) itemView.findViewById(R.id.textView))
                    .setTextColor(getResources().getColor(R.color.green));

//            itemView.setBackgroundColor(getResources().getColor(R.color.green));
//            adapter.notifyDataSetChanged();
        }
        return super.onContextItemSelected(item);
    }
}