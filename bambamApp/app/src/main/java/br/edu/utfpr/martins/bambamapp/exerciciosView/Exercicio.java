package br.edu.utfpr.martins.bambamapp.exerciciosView;

public class Exercicio {

    private String exercicio;
    private String nRepeticoes;
    private String nSeries;
    private String peso;
    private String repouso;
    private int exercicioImageId;

    public Exercicio (String exercicio, String nRepeticoes, String nSeries, String peso, String repouso, int img){
        this.exercicio = exercicio;
        this.nRepeticoes = nRepeticoes;
        this.nSeries = nSeries;
        this.peso = peso;
        this.repouso = repouso;
        this.exercicioImageId = img;
    }

    public String getExercicio() {
        return exercicio;
    }

    public String getnRepeticoes() {
        return nRepeticoes;
    }

    public String getnSeries() {
        return nSeries;
    }

    public String getPeso() {
        return peso;
    }

    public String getRepouso() {
        return repouso;
    }

    public int getExercicioImageId() {
        return exercicioImageId;
    }
}