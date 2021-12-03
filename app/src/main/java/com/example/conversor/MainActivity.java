package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText Txtvalor;
    private TextView Txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Txtvalor = findViewById(R.id.Txtvalor);
        Txtresultado = findViewById(R.id.Txtresultado);

    }

    public void calculo (View v){

    double valorBitcoin = Double.parseDouble(Txtvalor.getText().toString());
    double valorReais =  valorBitcoin * 304732.34;

    Txtresultado.setText(" Valor em Reais: " +valorReais);

    }

}