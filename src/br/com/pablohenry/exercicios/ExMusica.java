package br.com.pablohenry.exercicios;

public class ExMusica {
    /*
    Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir
    a ficha técnica, avaliar a música e calcular a média de avaliações.
    */

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;


    public void exibeFicha(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliações: " + avaliacao);
        System.out.println("Número de avaliações: " + numAvaliacoes);
        System.out.println("Média de avaliações: "  + mediaAvaliacao() + "\n");
    }

    public void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double mediaAvaliacao(){
        return avaliacao / numAvaliacoes;
    }

}
