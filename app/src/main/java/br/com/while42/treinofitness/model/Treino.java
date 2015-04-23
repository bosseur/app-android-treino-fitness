package br.com.while42.treinofitness.model;

import java.io.Serializable;
import java.util.List;

public class Treino {
    private String nome;
    private List<Exercicio> exercicios;
    private String descricao;
    private long id;

    public Treino(String nome) {
        this.nome = nome;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }
}
