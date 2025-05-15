package br.com.alura.model;

public class Audio {

    private String titulo;
    private double duracao;
    private int totalReproducao;
    private int totalCurtidas;
    private int classificacao;


    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalReproducao++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
