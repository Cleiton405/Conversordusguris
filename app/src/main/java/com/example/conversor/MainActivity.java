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

public class MainActivity extends AppCompatActivity {

    private TextInputEditText Txtmoeda;
    private Spinner Spmoeda;
    private Spinner Spcripto;
    private TextView Txtresultado;
    private Button btnconverter;
    private Button troca1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Txtmoeda = findViewById(R.id.Txtmoeda);
        Spcripto = findViewById(R.id.Spcripto);
        Spmoeda = findViewById(R.id.Spmoeda);
        Txtresultado = findViewById(R.id.Txtresultado);
        btnconverter = findViewById(R.id.btnConverter);


        troca1 = findViewById(R.id.troca1);
        troca1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });


                btnconverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor=Txtmoeda.getText().toString();
                if(valor.equals("")){
                    Toast.makeText(MainActivity.this,"digite um valor!!!",Toast.LENGTH_LONG).show();
                    return;
                }
                double valorMoeda = Double.parseDouble(Txtmoeda.getText().toString());
                if(Spmoeda.getSelectedItemPosition()== 0 || Spcripto.getSelectedItemPosition()== 0){
                    Toast.makeText(MainActivity.this,"Selecione uma moeda!!!",Toast.LENGTH_LONG).show();

                }else if(valorMoeda == 0){
                    Toast.makeText(MainActivity.this,"Digite um valor maior que 0",Toast.LENGTH_LONG).show();
                }else if(Spmoeda.getSelectedItemPosition()== 1){
                    if(Spcripto.getSelectedItemPosition()== 1){
                        //Real
                        double resultado;
                        resultado = valorMoeda * 281.94716;
                        Txtresultado.setText(" Valor:R$" +resultado);
                    } else if(Spcripto.getSelectedItemPosition()== 2){
                        double resultado;
                        resultado = valorMoeda * 2;
                        Txtresultado.setText(" Valor:R$" +resultado);
                    }else if(Spcripto.getSelectedItemPosition()== 3){
                        double resultado;
                        resultado = valorMoeda * 3;
                        Txtresultado.setText(" Valor:R$" +resultado);
                    }else if(Spcripto.getSelectedItemPosition()== 4){
                        double resultado;
                        resultado = valorMoeda * 4;
                        Txtresultado.setText(" Valor:R$" +resultado);
                    }else if(Spcripto.getSelectedItemPosition()== 5){
                        double resultado;
                        resultado = valorMoeda * 5;
                        Txtresultado.setText(" Valor:R$" +resultado);
                    }
                }
                if(Spmoeda.getSelectedItemPosition()== 2){
                    if(Spcripto.getSelectedItemPosition()== 1){
                        //Dólar
                        double resultado;
                        resultado = valorMoeda * 1;
                        Txtresultado.setText(" Valor:$" +resultado);
                    } else if(Spcripto.getSelectedItemPosition()== 2){
                        double resultado;
                        resultado = valorMoeda * 2;
                        Txtresultado.setText(" Valor:$" +resultado);
                    }else if(Spcripto.getSelectedItemPosition()== 3){
                        double resultado;
                        resultado = valorMoeda * 3;
                        Txtresultado.setText(" Valor:$" +resultado);
                    }else if(Spcripto.getSelectedItemPosition()== 4){
                        double resultado;
                        resultado = valorMoeda * 4;
                        Txtresultado.setText(" Valor:$" +resultado);
                    }else if(Spcripto.getSelectedItemPosition()== 5){
                        double resultado;
                        resultado = valorMoeda * 5;
                        Txtresultado.setText(" Valor:$" +resultado);
                    }
                }
                if(Spmoeda.getSelectedItemPosition()== 3){
                    if(Spcripto.getSelectedItemPosition()== 1){
                        //Euro
                        double resultado;
                        resultado = valorMoeda * 1;
                        Txtresultado.setText(" Valor:$" +resultado);
                    } else if(Spcripto.getSelectedItemPosition()== 2){
                        double resultado;
                        resultado = valorMoeda * 2;
                        Txtresultado.setText(" Valor:$" +resultado);
                    }else if(Spcripto.getSelectedItemPosition()== 3){
                        double resultado;
                        resultado = valorMoeda * 3;
                        Txtresultado.setText(" Valor:$" +resultado);
                    }else if(Spcripto.getSelectedItemPosition()== 4){
                        double resultado;
                        resultado = valorMoeda * 4;
                        Txtresultado.setText(" Valor:$" +resultado);
                    }else if(Spcripto.getSelectedItemPosition()== 5){
                        double resultado;
                        resultado = valorMoeda * 5;
                        Txtresultado.setText(" Valor:$" +resultado);
                    }
                }
            }
        });

    }

}