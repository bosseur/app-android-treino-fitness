package br.com.while42.treinofitness.model;

import java.io.Serializable;

public class Exercicio implements Serializable {
    private String nome;
    private int repeticao;
    private int serie;
    private int intervalo = 30;
    private long id;

    public Exercicio(String nome, int repeticao, int serie) {
        this.nome = nome;
        this.repeticao = repeticao;
        this.serie = serie;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getRepeticao() {
        return repeticao;
    }

    public int getSerie() {
        return serie;
    }

    public int getIntervalo() {
        return intervalo;
    }
}
