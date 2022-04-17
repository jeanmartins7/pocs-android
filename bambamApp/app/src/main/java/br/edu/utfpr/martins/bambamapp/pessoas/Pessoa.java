package br.edu.utfpr.martins.bambamapp.pessoas;

import java.io.Serializable;
import java.util.ArrayList;

public class Pessoa implements Serializable {
    private String nome;
    private String telefone;
    private ArrayList<String> dias;
    private String sexo;
    private String atividade;

    public Pessoa(String nome, String telefone, ArrayList<String> dias, String sexo, String atividade) {
        this.nome = nome;
        this.telefone = telefone;
        this.dias = dias;
        this.sexo = sexo;
        this.atividade = atividade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public void setDias(ArrayList<String> dias) {
        this.dias = dias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
}
