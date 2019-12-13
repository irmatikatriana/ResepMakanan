package com.example.resepmakanan;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MenulainnyaActivity extends AppCompatActivity {

    //Data-Data yang Akan dimasukan Pada ListView
    private String[] menu = {"Onde-Onde","Pasta","Rawon","Ice Cream","Rendang",
            "Salad Buah","Service Backhand","Spaghetti","Udang Tepung"};


    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulainnya);

        ListView listView = findViewById(R.id.list);
        data = new ArrayList<>();
        getData();

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_pelarian, data);
        listView.setAdapter(adapter);
    }

    private void getData(){
        Collections.addAll(data, menu);
    }


}


