package com.example.conversor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class ValoresDAO {

    public static void inserir(Context context, Valores valores){
        ContentValues values = new ContentValues();
        values.put( "moeda", valores.getMoeda() );
        values.put( "cripto", valores.getConversao() );
        values.put( "resultado", valores.getResultado() );

        Banco conn = new Banco(context);
        SQLiteDatabase db = conn.getWritableDatabase();

        db.insert("valores", null, values);
    }
   public static void excluir(Context context, int idValores){
       Banco conn = new Banco(context);
       SQLiteDatabase db = conn.getWritableDatabase();
       db.delete("valores", "id = "+idValores, null);
   }
   public static List<Valores> getValores(Context context){
        List<Valores> lista = new ArrayList<>();
        Banco conn = new Banco(context);
        SQLiteDatabase db = conn.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM valores ORDER BY moeda", null);

       if (cursor.getCount() > 0){

           cursor.moveToFirst();

           do {

               Valores val = new Valores();
               val.setId(cursor.getInt(0));
               val.setMoeda(cursor.getString(1));
               val.setConversao(cursor.getString(2));
               val.setResultado(cursor.getString(3));
               lista.add(val);

           }while ( cursor.moveToNext() );
       }
        return lista;
   }
        public static Valores getValoresById(Context context, int idValor){
        Banco conn = new Banco(context);
        SQLiteDatabase db = conn.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM valores WHERE id = "+idValor, null);

        if (cursor.getCount() > 0){
            cursor.moveToFirst();
            Valores val = new Valores();
            val.setId(cursor.getInt(0));
            val.setMoeda(cursor.getString(1));
            val.setConversao(cursor.getString(2));
            val.setResultado(cursor.getString(3));
            return val;
        }else {
            return null;
        }
        }
}
