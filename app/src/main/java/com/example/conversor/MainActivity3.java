package com.example.conversor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    private Button Voltar;
    private ListView lvvalores;
    private ArrayAdapter adapter;
    private List<Valores> listaDeValores;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carteira);
        lvvalores = findViewById(R.id.lvvalores);
        carregarValores();

        lvvalores.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {
                excluir(position);
                return true;
            }
        });


        Voltar = findViewById(R.id.Voltar);
        Voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    protected void onRestart(){
        super.onRestart();
        carregarValores();
    }

    private void carregarValores(){

        listaDeValores = ValoresDAO.getValores(this);
        if (listaDeValores.size() == 0) {
            Valores fake = new Valores("Lista Vazia", "", "");
            listaDeValores.add(fake);
            lvvalores.setEnabled(false);
        }else{
                lvvalores.setEnabled(true);
        }

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaDeValores);
        lvvalores.setAdapter(adapter);


    }

    private void excluir(int posicao){
        Valores valores = listaDeValores.get(posicao);
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle("Excluir...");
        alerta.setIcon(android.R.drawable.stat_sys_warning);
        alerta.setMessage("Você deseja remover a Conversão!!!");
        alerta.setNeutralButton("Cancelar", null);

        alerta.setPositiveButton("Excluir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                ValoresDAO.excluir(MainActivity3.this, valores.getId());
                carregarValores();
            }
        });
        alerta.show();
    }
}