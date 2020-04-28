package com.example.listagemsimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] dados= new String[] {"Maça","Morango", "Laranja","Abacate","Melancia","Cereja", "Uva","Banana","Açaí" ,"Ameixa"; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
