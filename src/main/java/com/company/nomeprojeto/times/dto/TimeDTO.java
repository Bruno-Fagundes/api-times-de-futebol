package com.company.nomeprojeto.times.dto;

/**
 * Data Transfer Object que representa um time de futebol.
 * Utilizado para transferência de dados entre as camadas da aplicação.
 */
public class TimeDTO {
    private Long id;
    private String nome;
    private String cidade;
    private String rival;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }
}
