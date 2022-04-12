package br.edu.utfpr.martins.jean;

public class Exercicio {

    private String exercicio;
    private Integer nRepeticoes;
    private Integer nSeries;
    private Integer peso;
    private Integer repouso;

    public Exercicio (String exercicio, Integer nRepeticoes, Integer nSeries, Integer peso, Integer repouso){
        setExercicio(exercicio);
        setnRepeticoes(nRepeticoes);
        setnSeries(nSeries);
        setPeso(peso);
        setRepouso(repouso);
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public Integer getnRepeticoes() {
        return nRepeticoes;
    }

    public void setnRepeticoes(Integer nRepeticoes) {
        this.nRepeticoes = nRepeticoes;
    }

    public Integer getnSeries() {
        return nSeries;
    }

    public void setnSeries(Integer nSeries) {
        this.nSeries = nSeries;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getRepouso() {
        return repouso;
    }

    public void setRepouso(Integer repouso) {
        this.repouso = repouso;
    }

    @Override
    public String toString(){
        return getExercicio() + " - " + getnRepeticoes() + " - " + getnSeries() + " - "
                + getPeso() + " - " + getRepouso();
    }

}
