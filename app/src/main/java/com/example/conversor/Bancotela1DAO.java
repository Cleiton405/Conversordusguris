package com.example.conversor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class Bancotela1DAO {

    public static void inserir(Context context, Bancotela1 bancotela1){

        ContentValues values = new ContentValues();
        values.put("moeda", bancotela1.moeda);
        values.put("cripto", bancotela1.cripto);
        values.put("resultado", bancotela1.resultado);
        values.put("moeda1", bancotela1.moeda1);
        values.put("cripto1", bancotela1.cripto1);
        values.put("resultado1", bancotela1.resultado1);

        Banco conn = new Banco(context);
        SQLiteDatabase db = conn.getWritableDatabase();

        db.insert("moedas", null, values);
        db.insert("moedas1", null, values);

    }

    public static void excluir(Context context, Bancotela1 bancotela1){

        Banco conn = new Banco(context);
        SQLiteDatabase db = conn.getWritableDatabase();

        db.delete("moedas","moeda = moedas1 = cripto = cripto1 = resultado = resultado1"
                +bancotela1.moeda+bancotela1.moeda1
                +bancotela1.cripto+bancotela1.cripto1
                +bancotela1.resultado+bancotela1.resultado1, null);

    }

    public static List<Bancotela1> getBancotelas1(Context context){

        List<Bancotela1> lista = new ArrayList<>();

        Banco conn = new Banco(context);
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM moedas ORDER BY moeda", null);
        Cursor cursor1 = db.rawQuery("SELECT * FROM moedas1 ORDER BY moeda1", null);

        if (cursor.getCount() > 0){

            cursor.moveToFirst();

            do{

                Bancotela1 banco = new Bancotela1();
                banco.setMoeda(cursor.getString(0));
                banco.setCripto(cursor.getString(1));
                banco.setResultado(cursor.getString(2));

                lista.add(banco);

            }while(cursor.moveToNext());

        }

        if (cursor1.getCount() > 0){

            cursor1.moveToFirst();

            do{

                Bancotela1 banco1 = new Bancotela1();
                banco1.setMoeda1(cursor1.getString(0));
                banco1.setCripto1(cursor1.getString(1));
                banco1.setResultado1(cursor1.getString(2));

                lista.add(banco1);

            }while(cursor1.moveToNext());

        }

        return lista;
    }

}








