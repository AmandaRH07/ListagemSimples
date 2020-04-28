package com.example.listagemsimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] dados= new String[] {"Maca","Morango", "Laranja","Abacate","Melancia","Cereja", "Uva","Banana","Acai" ,"Ameixa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.listView);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,dados);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorTexto = dados[position];
                Toast.makeText(getBaseContext(),valorTexto,Toast.LENGTH_LONG).show();
            }
        });
    }
}
