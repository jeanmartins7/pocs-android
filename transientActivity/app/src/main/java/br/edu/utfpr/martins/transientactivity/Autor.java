package br.edu.utfpr.martins.transientactivity;

import java.io.Serializable;

public class Autor implements Serializable {

    private String nome;
    private String sobrenome;
    private String email;
    private String curso;
    private String objetivo;

    public Autor(String nome, String sobrenome, String email, String curso, String objetivo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.curso = curso;
        this.objetivo = objetivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
