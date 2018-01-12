package com.example.ahmed.bus_time_djerba4;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    static final String Tag2 = "SAC";
    final String Extra_resultats = "resultat";
    DataBaseHelper dbh;
    Button ok;


    AutoCompleteTextView field1;
    AutoCompleteTextView field2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbh = new DataBaseHelper(this);

        field1 = findViewById(R.id.autoText);
        field2 = findViewById(R.id.autoText2);

        //Creation d'un adapteur pour le premier field (field1)
        String[] tab_Departs=getResources().getStringArray(R.array.tableau_des_gars_departs);
         ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,tab_Departs);
        field1.setAdapter(adapter1);
        field1.setThreshold(1);


        //Creation d'un adapteur pour le deuxième field (field2)
        String[] tab_Dests=getResources().getStringArray(R.array.tableau_des_gars_destinations);
         ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,tab_Dests);
        field2.setAdapter(adapter2);
        field2.setThreshold(1);


        ok = findViewById(R.id.button);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Station_Display.class);

                String r=dbh.QuerySQL(field1.getText().toString(),field2.getText().toString());
                intent.putExtra(Extra_resultats, r);
                Log.i(Tag2,r);
                startActivity(intent);
            }
        });
    }




}