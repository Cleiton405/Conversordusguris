package com.example.conversor;

public class Valores {
    public int id;
    public String moeda;
    public String conversao;
    public String resultado;



    public Valores(){

    }

    public Valores(String moeda, String cripto, String resultado){
        this.moeda = moeda;
        this.conversao = conversao;
        this.resultado = resultado;
    }

    public String toString(){return moeda+"/"+conversao+":"+resultado;}

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getMoeda() { return moeda; }

    public void setMoeda(String moeda) { this.moeda = moeda; }

    public String getConversao() { return conversao; }

    public void setConversao(String conversao) { this.conversao = conversao; }

    public String getResultado() { return resultado; }

    public void setResultado(String resultado) { this.resultado = resultado; }
}
