package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    private ListView lvBancotela1;
    private ArrayAdapter adapter;
    private List<Bancotela1> listademoedas;

    Button btncarteira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lvBancotela1 = findViewById(R.id.lvmoedas);
        carregarmoedas();

//-------------------------------------------------------------------------------------------------//

//-------------------------------------------------------------------------------------------------//

        btncarteira = findViewById(R.id.btncarteira);
        btncarteira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(i);

            }
        });
    }

//-------------------------------------------------------------------------------------------------//

//-------------------------------------------------------------------------------------------------//

    private void carregarmoedas(){

        listademoedas = Bancotela1DAO.getBancotelas1(this);

        if (listademoedas.size()==0){

            Bancotela1 fake = new Bancotela1("!!! Lista vazia !!!", "!!! Lista vazia !!!", "!!! Lista vazia !!!",
                    "!!! Lista vazia !!!", "!!! Lista vazia !!!", "!!! Lista vazia !!!");

            listademoedas.add(fake);
            lvBancotela1.setEnabled(false);

        }else {

            lvBancotela1.setEnabled(true);

        }

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listademoedas);
        lvBancotela1.setAdapter(adapter);

    }

//-------------------------------------------------------------------------------------------------//

//-------------------------------------------------------------------------------------------------//

    // Parte final para atualizar a lista

    @Override
    protected void onRestart(){
        super.onRestart();
        carregarmoedas();

   }



}