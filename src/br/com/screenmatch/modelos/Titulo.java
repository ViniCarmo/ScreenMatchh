package br.com.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoDelancamento() {
        return anoDelancamento;
    }
    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }
    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDelancamento);
        System.out.println("Duração do Filme: " + duracaoEmMinutos);
        System.out.println("Incluido no Plano: " + incluidoNoPlano);


    }
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}