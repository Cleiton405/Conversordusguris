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
    private Valores valores;
    private Button btnSalvar;
    private Button carteira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Txtmoeda = findViewById(R.id.Txtmoeda);
        Spcripto = findViewById(R.id.Spcripto);
        Spmoeda = findViewById(R.id.Spmoeda);
        Txtresultado = findViewById(R.id.Txtresultado);
        btnconverter = findViewById(R.id.btnConverter);
        btnSalvar = findViewById(R.id.btnSalvar);
        carteira = findViewById(R.id.carteira);

//-------------------------------------------------------------------------------------------------//
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { salvar(); }
        });

//-------------------------------------------------------------------------------------------------//
        carteira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });
//-------------------------------------------------------------------------------------------------//
        troca1 = findViewById(R.id.troca1);
        troca1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

            }
        });
//-------------------------------------------------------------------------------------------------//
        btnconverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = Txtmoeda.getText().toString();
                if (valor.equals("")) {
                    Toast.makeText(MainActivity.this, "Digite um valor!!!", Toast.LENGTH_LONG).show();
                    return;
                }
                double valorMoeda = Double.parseDouble(Txtmoeda.getText().toString());
                if (Spmoeda.getSelectedItemPosition() == 0 || Spcripto.getSelectedItemPosition() == 0) {
                    Toast.makeText(MainActivity.this, "Selecione uma moeda!!!", Toast.LENGTH_LONG).show();

                } else if (valorMoeda == 0) {
                    Toast.makeText(MainActivity.this, "Digite um valor maior que 0", Toast.LENGTH_LONG).show();
                } else if (Spmoeda.getSelectedItemPosition() == 1) {
                    if (Spcripto.getSelectedItemPosition() == 1) {
                        //Real
                        double resultado;
                        resultado = valorMoeda * 268.38709;
                        Txtresultado.setText(" Valor:R$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 2) {
                        double resultado;
                        resultado = valorMoeda * 23.35573;
                        Txtresultado.setText(" Valor:R$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 3) {
                        double resultado;
                        resultado = valorMoeda * 3.22767;
                        Txtresultado.setText(" Valor:R$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 4) {
                        double resultado;
                        resultado = valorMoeda * 591.40;
                        Txtresultado.setText(" Valor:R$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 5) {
                        double resultado;
                        resultado = valorMoeda * 29.25;
                        Txtresultado.setText(" Valor:R$" + resultado);
                    }
                }
                if (Spmoeda.getSelectedItemPosition() == 2) {
                    if (Spcripto.getSelectedItemPosition() == 1) {
                        //Dólar
                        double resultado;
                        resultado = valorMoeda * 48.29447;
                        Txtresultado.setText(" Valor:$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 2) {
                        double resultado;
                        resultado = valorMoeda * 4.19047;
                        Txtresultado.setText(" Valor:$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 3) {
                        double resultado;
                        resultado = valorMoeda * 579.35;
                        Txtresultado.setText(" Valor:$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 4) {
                        double resultado;
                        resultado = valorMoeda * 106.01;
                        Txtresultado.setText(" Valor:$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 5) {
                        double resultado;
                        resultado = valorMoeda * 5.25;
                        Txtresultado.setText(" Valor:$" + resultado);
                    }
                }
                if (Spmoeda.getSelectedItemPosition() == 3) {
                    if (Spcripto.getSelectedItemPosition() == 1) {
                        //Euro
                        double resultado;
                        resultado = valorMoeda * 42.77659;
                        Txtresultado.setText(" Valor:$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 2) {
                        double resultado;
                        resultado = valorMoeda * 3.71033;
                        Txtresultado.setText(" Valor:$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 3) {
                        double resultado;
                        resultado = valorMoeda * 513.64;
                        Txtresultado.setText(" Valor:$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 4) {
                        double resultado;
                        resultado = valorMoeda * 93.86;
                        Txtresultado.setText(" Valor:$" + resultado);
                    } else if (Spcripto.getSelectedItemPosition() == 5) {
                        double resultado;
                        resultado = valorMoeda * 4.64;
                        Txtresultado.setText(" Valor:$" + resultado);
                    }
                }
            }
        });

    }

    public void salvar(){
        String valor = Txtmoeda.getText().toString();
        String resultado = Txtresultado.getText().toString();

        if(Spmoeda.getSelectedItemPosition() == 0 || Spcripto.getSelectedItemPosition() == 0 || valor.equals("")){
            Toast.makeText(this, "!!! Preencha todos os campos !!!", Toast.LENGTH_LONG).show();

        }else if (resultado.equals("")){
            Toast.makeText(this, "!!! Faça a conversão !!!", Toast.LENGTH_LONG).show();
        }
        else{
            valores = new Valores();
            valores.setMoeda(Spcripto.getSelectedItem().toString());
            valores.setConversao(Spmoeda.getSelectedItem().toString());
            valores.setResultado(resultado);


                ValoresDAO.inserir(this, valores);
                Spmoeda.setSelection(0, true);
                Spcripto.setSelection(0, true);
                Txtresultado.setText("");


        }

    }
}











