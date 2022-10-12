package br.com.branch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int duracao;

    public Materia(){}


    public Materia(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }
}
