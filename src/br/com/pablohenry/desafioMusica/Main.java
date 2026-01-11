package br.com.pablohenry.desafioMusica;

public class Main {
    static void main(String[] args) {
        Musica pimmiesDilemma = new Musica("Pimmie's Dilemma", "PARTYNEXTDOOR", 118 );
        pimmiesDilemma.like();
        pimmiesDilemma.like();
        pimmiesDilemma.like();
        pimmiesDilemma.reproduzir(pimmiesDilemma.getTitulo());
        pimmiesDilemma.infos();

        Podcast bocadinhas = new Podcast("Quase Tivemos um Tema", "Bocadinhas", 3240);
        bocadinhas.like();
        bocadinhas.like();
        bocadinhas.reproduzir(bocadinhas.getTitulo());
        bocadinhas.infos();
    }
}
