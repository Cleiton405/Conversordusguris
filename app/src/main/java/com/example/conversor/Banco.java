package com.example.conversor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "Banco";
    private static final int VERSAO = 1;

    public Banco(Context context){

        super(context, NOME_BANCO, null, VERSAO);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL( "CREATE TABLE IF NOT EXISTS moedas (  "+

                "  moeda TEXT NOT NULL , " +

                "  cripto TEXT NOT NULL," +

                "  resultado TEXT NOT NULL) ");

        sqLiteDatabase.execSQL( "CREATE TABLE IF NOT EXISTS moedas1 (  "+

                "  moeda1 TEXT NOT NULL , " +

                "  cripto1 TEXT NOT NULL," +

                "  resultado1 TEXT NOT NULL) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}