package com.example.conversor;

import android.content.Context;

public class Bancotela1 {

    public String moeda;
    public String cripto;
    public String resultado;

    public String moeda1;
    public String cripto1;
    public String resultado1;

    public Bancotela1() {



    }

    public Bancotela1(String moeda, String cripto, String resultado, String moeda1, String cripto1, String resultado1) {
        this.moeda = moeda;
        this.cripto = cripto;
        this.resultado = resultado;

        this.moeda1 = moeda1;
        this.cripto1 = cripto1;
        this.resultado1 = resultado1;
    }

    public String toString(){

        return "Conversor1 --" +moeda + " -- "+ cripto +" -- " +resultado+ "  "+
               "Conversor2 --" +moeda1 + " -- "+ cripto1 +" -- " +resultado1;

    }

    public String getMoeda1() {
        return moeda1;
    }

    public void setMoeda1(String moeda1) {
        this.moeda1 = moeda1;
    }

    public String getCripto1() {
        return cripto1;
    }

    public void setCripto1(String cripto1) {
        this.cripto1 = cripto1;
    }

    public String getResultado1() {
        return resultado1;
    }

    public void setResultado1(String resultado1) {
        this.resultado1 = resultado1;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public String getCripto() {
        return cripto;
    }

    public void setCripto(String cripto) {
        this.cripto = cripto;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
