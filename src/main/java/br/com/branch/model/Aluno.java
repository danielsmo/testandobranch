package br.com.branch.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int idade;

    @OneToMany
    private List<Materia> materias;

    public Aluno(){}

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<Materia> getMaterias() {
        return materias;
    }
}
