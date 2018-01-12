package com.example.ahmed.bus_time_djerba4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

/**
 * Created by Ahmed on 03/12/2017.
 */

public class Station_Display extends AppCompatActivity {


    final String Extra_resultats = "resultat";
    Button retour;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_display);

        Intent intent=getIntent();
        TextView textView=findViewById(R.id.text);

        if(intent!=null){

            textView.setText(intent.getStringExtra(Extra_resultats));
        }

        retour=findViewById(R.id.button2);

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Station_Display.this,MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}