package com.example.ahmed.bus_time_djerba4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Ahmed on 03/12/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    static final String Tag="MyActivite";
    public static final String DataBaseName="Bus";
    public static final String TABLE_Name="LigneDestination";

    public static final String Col_2="ligne";
    public static final String Col_3="gareDéparts";
    public static final String Col_4="destination";
    public static final String Col_5="mix_destination_depart";
    public static final String Col_6="hours";

    public static final String Table_Creation="CREATE TABLE "+TABLE_Name+" (id INTEGER PRIMARY KEY  AUTOINCREMENT, " +
            ""+Col_2+" INTEGER, " +Col_3+ " TEXT, "+Col_4+" TEXT, "+Col_5+" "+" TEXT, "+Col_6+" TEXT);";


    public DataBaseHelper(Context context) {
        super(context, DataBaseName, null, 17
        );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Table_Creation);


        //  Dates Aller A partir de Houmet El Souk
        insertData(db,10, "HoumetSouk", "El May-Midoun puis Club-med","El May-Midoun","6h30 \t 7h10 \t 8h30 \t " +
                "10h00 \t 11h15 12h15 13h45 14h30 15h30 16h15 17h15 18h15");
        insertData(db,11, "HoumetSouk", "Zone Touristique puis Dar-djerba","Zone Touristique", "6h00 \t 7h15 \t 8h00 " +
                "\t 9h15 \t 10h15 \t 11h15 \t 12h15 \t 13h15 \t 14h00 \t 15h15 \t 16h00 \t 17h15 \t 18h15 \t 20h45");
        insertData(db,11, "HoumetSouk", "Dar-djerba Club-med","Dar-djerba" ,"6h00 \t 7h15 \t 10h15 \t 14h00 \t " +
                "16h00 \t 20h45 ");

        insertData(db,12, "HoumetSouk", "Ajim", "","7h00 \t 8h00 \t 11h15 \t 12h15 \t 13h15 \t 16h15 " +
                "\t 17h15 \t 18h15");

        insertData(db,13, "HoumetSouk", "Midoun puis Béni maaguel","Midoun", "8h00 \t 10h30 \t 12h15 \t " +
                "16h15\t 18h15");

        insertData(db,14, "HoumetSouk", "Erriadh puis Guellala","Erriadh" ,"6h00 \t 8h00 \t 10h15 \t 11h15 \t" +
                " 12h15 \t 13h30 \t 16h15 \t 17h15 \t 18h15");

        insertData(db,15, "HoumetSouk", "Mellita puis Aeroport","Mellita", "7h10\t 12h15\t 18h15");

        insertData(db,16, "HoumetSouk", "Robbana puis Seduikech", "Robbana","6h00 \t 7h25 \t 8h30 \t 10h30 " +
                "\t 12h15 \t 13h00 \t 14h30 \t 15h30 \t 17h15 \t 18h15");

        insertData(db,17, "HoumetSouk", "Guecheine","" ,"6h30 \t 8h15 \t 12h15 \t 17h15 \t 18h15");

        insertData(db,18, "HoumetSouk", "Oued zbib","" ,"6h15 \t 8h00 \t 12h15 \t 17h15 \t 18h15");

        //Dates Retour vers Houmet Souk

        insertData(db,10, "Club-med", "Midoun-El May puis HoumetSouk", "Midoun-El May","6h35 \t 7h50 \t 9h30 \t " +
                "11h00 \t 13h20 \t 14h40 \t 16h40 \t 18h30");

        insertData(db,11, "Dar-djerba", "Zone Tourstique puis HoumetSouk","Zone Tourstique", "7h15 \t 8h15 \t 8h45 \t"
                + " 10h10 \t 11h00 \t 12h05 \t 13h00 \t 15h00 \t 16h00 \t 16h20 \t 17h20 \t 18h00 \t 19h00 \t 22h00");

        insertData(db,11, "Club-med", "Dar-djerba puis HoumetSouk", "Dar-djerba","7h15 \t 10h50 \t 14h30 \t 16h15" +
                "\t 21h50");

        insertData(db,12, "Ajim", "HoumetSouk","", "6h30 \t7h25 \t 8h00 \t 9h00 \t 12h15 \t 13h15 " +
                "\t 14h00 \t 17h15 \t 17h45");

        insertData(db,13, "Béni maaguel", " Midoun puis HoumetSouk"," Midoun", "7h00 \t 8h15 \t 9h30 \t 11h30"
                + " \t 14h00 \t 17h30");

        insertData(db,14, "Guellala", "Erriadh puis HoumetSouk","Erriadh", "6h30 \t 8h00 \t 9h10 \t 11h00 \t"
                + " 13h05 \t 14h00 \t 16h45 \t 17h45 \t 18h45");

        insertData(db,15, "Aeroport", "Melitta puis HoumetSouk", "Melitta","7h30 \t 13h00 \t 18h30");

        insertData(db,16, "Seduikech", "Robbana puis HoumetSouk","Robbana", "6h30 \t 8h10 \t 9h00 \t 11h00" +
                "\t 12h50 \t 13h15 \t 14h30 \t 17h50 \t 18h45");

        insertData(db,17, "Guecheine", " HoumetSouk","", "6h45 \t 8h30 \t 13h10 \t 17h40 \t 18h40");

        insertData(db,18, "Oued zbib", "HoumetSouk","" ,"6h45 \t 8h15 \t 13h10 \t 17h40 \t 18h40");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("Drop TABLE IF EXISTS "+TABLE_Name);
        onCreate(db);
    }


    boolean insertData(SQLiteDatabase db ,int ligne ,String gare_depart ,String destination ,String mix ,String hours ){

        ContentValues values =new ContentValues();

        values.put(Col_2,ligne);
        values.put(Col_3,gare_depart);
        values.put(Col_4,destination);
        values.put(Col_5,mix);
        values.put(Col_6,hours);
        long result=db.insert(TABLE_Name,null,values);

        if(result==-1){
            Log.e(Tag,"l'insertion est échoué");
            return false;}
        else {
            Log.i(Tag,"l'insertion est réussi");
            return true;
        }

    }

    public String  QuerySQL(String DepartStation,String Destination){

        String result="";
        if( DepartStation.equals("")|| Destination.equals("")) {result="Champ vide: veuillez remplire les champs";}
        else {
            DepartStation = '%' + DepartStation + '%';
            Destination = '%' + Destination + '%';

            SQLiteDatabase db = this.getReadableDatabase();
            Cursor c = db.rawQuery("select distinct * from " + TABLE_Name + " where (" + Col_3 + "  LIKE ? or "+ Col_5 +" LIKE ? )  and " + Col_4 + " LIKE ? ", new String[]{DepartStation,DepartStation ,Destination});

            while (c.moveToNext()) {
                //affichage des lignes
                int ligne = c.getInt(1);
                String Station = c.getString(2);
                String Dest = c.getString(3);
                String hours = c.getString(5);
                result += "\n" + ligne + "|" + Station + "--" + Dest + " " + hours;
            }
            c.close();
        }

        return result;
    }


}
