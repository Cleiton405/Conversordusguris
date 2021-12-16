package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    private TextInputEditText Txtcripto1;
    private Spinner spcripto1;
    private Spinner spmoeda1;
    private TextView Txtresultado1;
    private String acao;
    private Valores valores;
    private Button btnconverter1;
    private Button troca2;
    private Button carteira1;
    private Button btnSalvar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Txtcripto1 = findViewById(R.id.Txtcripto1);
        spcripto1 = findViewById(R.id.spcripto1);
        spmoeda1 = findViewById(R.id.spmoeda1);
        Txtresultado1 = findViewById(R.id.Txtresultado1);
        btnconverter1 = findViewById(R.id.btnConverter1);
        troca2 = findViewById(R.id.troca2);
//-------------------------------------------------------------------------------------------------//
        btnSalvar1 = findViewById(R.id.btnSalvar1);
        btnSalvar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { salvar(); }
        });
//-------------------------------------------------------------------------------------------------//
        carteira1 = findViewById(R.id.carteira1);
        carteira1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
//-------------------------------------------------------------------------------------------------//
        troca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                 startActivity(intent);
            }
        });

//-------------------------------------------------------------------------------------------------//
        btnconverter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor=Txtcripto1.getText().toString();
                if(valor.equals("")){
                    Toast.makeText(MainActivity2.this,"Digite um valor!!!",Toast.LENGTH_LONG).show();
                    return;
                }
                double valorCripto = Double.parseDouble(Txtcripto1.getText().toString());
                if(spcripto1.getSelectedItemPosition()== 0 || spmoeda1.getSelectedItemPosition()== 0){
                    Toast.makeText(MainActivity2.this,"Selecione uma moeda!!!",Toast.LENGTH_LONG).show();

                }else if(valorCripto == 0){
                    Toast.makeText(MainActivity2.this,"Digite uma valor maior que 0",Toast.LENGTH_LONG).show();
                }else if(spcripto1.getSelectedItemPosition()== 1){
                    if(spmoeda1.getSelectedItemPosition()== 1){
                        //Real
                        double resultado;
                        resultado = valorCripto/(268.38709);
                        Txtresultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 2){
                        //Dólar
                        double resultado;
                        resultado = valorCripto/(48.29447);
                        Txtresultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 3){
                        //Euro
                        double resultado;
                        resultado = valorCripto/(42.77659);
                        Txtresultado1.setText(" Valor:"+resultado);
                    }
                }else if(spcripto1.getSelectedItemPosition()== 2){
                    if(spmoeda1.getSelectedItemPosition()== 1){
                        //Real
                        double resultado;
                        resultado = valorCripto/(23.35573);
                        Txtresultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 2){
                        //Dólar
                        double resultado;
                        resultado = valorCripto/(4.19047);
                        Txtresultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 3){
                        //Euro
                        double resultado;
                        resultado = valorCripto/(3.71033);
                        Txtresultado1.setText(" Valor:"+resultado);
                    }
                }else if(spcripto1.getSelectedItemPosition()== 3){
                    if(spmoeda1.getSelectedItemPosition()== 1){
                        //Real
                        double resultado;
                        resultado = valorCripto/(3.22767);
                        Txtresultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 2){
                        //Dólar
                        double resultado;
                        resultado = valorCripto/(579.35);
                        Txtresultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 3){
                        //Euro
                        double resultado;
                        resultado = valorCripto/(513.64);
                        Txtresultado1.setText(" Valor:"+resultado);
                    }
                }else if(spcripto1.getSelectedItemPosition()== 4){
                    if(spmoeda1.getSelectedItemPosition()== 1){
                        //Real
                        double resultado;
                        resultado = valorCripto/(591.40);
                        Txtresultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 2){
                        //Dólar
                        double resultado;
                        resultado = valorCripto/(106.01);
                        Txtresultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 3){
                        //Euro
                        double resultado;
                        resultado = valorCripto/(93.86);
                        Txtresultado1.setText(" Valor:"+resultado);
                    }
                }else if(spcripto1.getSelectedItemPosition()== 5){
                    if(spmoeda1.getSelectedItemPosition()== 1){
                        //Real
                        double resultado;
                        resultado = valorCripto/(29.25);
                        Txtresultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 2){
                        //Dólar
                        double resultado;
                        resultado = valorCripto/(5.25);
                        Txtresultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 3){
                        //Euro
                        double resultado;
                        resultado = valorCripto/(4.64);
                        Txtresultado1.setText(" Valor:"+resultado);
                    }
                }
                }
        });
    }
    //-------------------------------------------------------------------------------------------------//
    public void salvar() {

        String resultado = Txtresultado1.getText().toString();
        String valor = Txtcripto1.getText().toString();

        if(spmoeda1.getSelectedItemPosition() == 0 || spcripto1.getSelectedItemPosition() == 0 || valor.equals("")){

            Toast.makeText(this, "!!! Preencha todos os campos !!!", Toast.LENGTH_LONG).show();

        }else if (resultado.equals("")){
            Toast.makeText(this, "!!! Faça a conversão !!!", Toast.LENGTH_LONG).show();
        }
        else{

            valores = new Valores();

            valores.setMoeda(spmoeda1.getSelectedItem().toString());
            valores.setConversao(spcripto1.getSelectedItem().toString());
            valores.setResultado(resultado);

            ValoresDAO.inserir(this,valores);
            spcripto1.setSelection(0, true);
            spmoeda1.setSelection(0, true);
            Txtresultado1.setText("");
            }
        }

    }
