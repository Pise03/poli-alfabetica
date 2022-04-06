package com.critto;

public class Chiave {
    private String nome;
    private int k;


    public Chiave(String nome, int k){
        this.nome = nome;
        this.k = k;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getK() {
        return this.k;
    }

    public void setK(int k) {
        this.k = k;
    }

}
