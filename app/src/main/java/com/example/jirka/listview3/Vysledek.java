package com.example.jirka.listview3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Vysledek extends AppCompatActivity {

    ListView lvVysledky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vysledek);

        lvVysledky = (ListView) findViewById(R.id.lvVysledek);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        String[] data = b.getStringArray("SelectedItems");
        ArrayAdapter<String>  adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        lvVysledky.setAdapter(adapter);


    }
}
