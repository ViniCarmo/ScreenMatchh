
public class Filme {
    String nome;
    int anoDelancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDelancamento);
        System.out.println("Duração do Filme: " + duracaoEmMinutos);


    }
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double pegaMedia() {
    return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}