package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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
    private TextView resultado1;
    private Button btnconverter1;
    private Button troca2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Txtcripto1 = findViewById(R.id.Txtcripto1);
        spcripto1 = findViewById(R.id.spcripto1);
        spmoeda1 = findViewById(R.id.spmoeda1);
        resultado1 = findViewById(R.id.resultado1);
        btnconverter1 = findViewById(R.id.btnConverter1);
        troca2 = findViewById(R.id.troca2);


        troca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                 startActivity(intent);
            }
        });

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
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 2){
                        //Dólar
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 3){
                        //Euro
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    }
                }else if(spcripto1.getSelectedItemPosition()== 2){
                    if(spmoeda1.getSelectedItemPosition()== 1){
                        //Real
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 2){
                        //Dólar
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 3){
                        //Euro
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    }
                }else if(spcripto1.getSelectedItemPosition()== 3){
                    if(spmoeda1.getSelectedItemPosition()== 1){
                        //Real
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 2){
                        //Dólar
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 3){
                        //Euro
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    }
                }else if(spcripto1.getSelectedItemPosition()== 4){
                    if(spmoeda1.getSelectedItemPosition()== 1){
                        //Real
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 2){
                        //Dólar
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 3){
                        //Euro
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    }
                }else if(spcripto1.getSelectedItemPosition()== 5){
                    if(spmoeda1.getSelectedItemPosition()== 1){
                        //Real
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 2){
                        //Dólar
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    } else if(spmoeda1.getSelectedItemPosition()== 3){
                        //Euro
                        double resultado;
                        resultado = valorCripto/(32.30);
                        resultado1.setText(" Valor:"+resultado);
                    }
                }

                }

        });

    }
}