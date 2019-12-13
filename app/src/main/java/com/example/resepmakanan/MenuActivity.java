package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void goreng (View view){
        Intent a = new Intent (getApplicationContext(),AyamActivity.class);
        startActivity(a);
    }
    public void sapi (View view){
        Intent a = new Intent (getApplicationContext(),DagingActivity.class);
        startActivity(a);
    }
    public void kue (View view){
        Intent a = new Intent (getApplicationContext(),DessertActivity.class);
        startActivity(a);
    }
    public void pitza (View view){
        Intent a = new Intent (getApplicationContext(),PizzaActivity.class);
        startActivity(a);
    }
    public void list (View view){
        Intent a = new Intent (getApplicationContext(),MenulainnyaActivity.class);
        startActivity(a);
    }
    public void saran (View view){
        Intent a = new Intent (getApplicationContext(),KritiksaranActivity.class);
        startActivity(a);
    }





}
