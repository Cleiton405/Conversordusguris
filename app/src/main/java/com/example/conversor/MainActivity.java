package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText Txtvalor;
    private TextInputEditText Txtvalor1;
    private TextView Txtresultado;
    private TextView Txtresultado1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Txtvalor = findViewById(R.id.Txtvalor);
        Txtresultado = findViewById(R.id.Txtresultado);
        Txtvalor1 = findViewById(R.id.Txtvalor1);
        Txtresultado1 = findViewById(R.id.Txtresultado1);

    }

    public void calculo (View v){

        DecimalFormat arredondar = new DecimalFormat("#.##");

    double valorBitcoin = Double.parseDouble(Txtvalor.getText().toString());
    double valorEuros = Double.parseDouble(Txtvalor1.getText().toString());

    double valorReais1 = valorEuros * 12;
    double valorReais =  valorBitcoin * 304732.34;

    Txtresultado.setText(" Valor em Reais: " +valorReais +"$");
    Txtresultado1.setText(" Valor em Reais: " +valorReais1 + "$");

    }



}