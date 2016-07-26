package com.example.jirka.listview3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnOk;

    ListView lvListView;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // získávání handlů
        btnOk = (Button) findViewById(R.id.btnOK);
        lvListView = (ListView) findViewById(R.id.lvListView);

        // nastavení ListView do multiplechoice a vstupních dat
        String [] verze = getResources().getStringArray(R.array.data_verze_array);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice,verze);
        lvListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lvListView.setAdapter(adapter);


        btnOk.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        Toaster.toastMessage(this, "Onclick OK Button");
        SparseBooleanArray checked = lvListView.getCheckedItemPositions();

        //Sparse Array může obsahovat díry (mohou se v něm vyskytnout i položky, ketré mají hodnotu false
        // proto se nejříve hodoty vykopírují do ArrayListu
        ArrayList<String> vybrane = new ArrayList<String>();


        for (int i=0; i<checked.size();i++) {
            // pozice v rámci adaptéru
            int position = checked.keyAt(i);
            // přidej označené položky
            if (checked.valueAt(i)) vybrane.add(adapter.getItem(position));
        }

        // Ale asi proto, že zřejmě předávat do bundle lze ale pouze StringArray, udělá se ještě jedna konverze
        String [] vysledky = new String[vybrane.size()];
        for (int i=0; i<vybrane.size(); i++)
        {
            vysledky [i] = vybrane.get(i);
        }

        Intent intentVysledky = new Intent (getApplicationContext(), Vysledek.class);
        Bundle b = new Bundle();
        b.putStringArray("SelectedItems", vysledky);
        intentVysledky.putExtras(b);
        startActivity(intentVysledky);

    }
}

//Master  change 01 on Mac
// PC update 01
// Master - Mac Change 02
// Master -Mac Change 03
// Master - PC Change 04

//MacBranch01 initial
//MacBranch01 PC change 01
//MacBranch01 Mac CHange 01
//MacBranch01 PC CHange 02