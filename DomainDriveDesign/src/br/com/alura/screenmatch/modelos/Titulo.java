package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPLano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;


    public void exibeFichaTecnica(){
        System.out.println("Ficha Tecnica");
        System.out.println("Nome: " + nome);
        System.out.println("Ano Lancamento: " + anoLancamento);
        System.out.println("Incluidono plano " + incluidoNoPLano);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao ++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes/ totalDeAvaliacao;
    }

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPLano(boolean incluidoNoPLano) {
        this.incluidoNoPLano = incluidoNoPLano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPLano() {
        return incluidoNoPLano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
