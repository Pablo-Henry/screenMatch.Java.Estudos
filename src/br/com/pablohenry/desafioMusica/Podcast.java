package br.com.pablohenry.desafioMusica;

public class Podcast extends Audio implements Interacoes{

    public Podcast(String titulo, String autor, int duracao){
        super(titulo, autor, duracao);
    }

    @Override
    public int like(){
        this.setCurtidas(this.getCurtidas() + 1);
        return getCurtidas();
    }

    @Override
    public void reproduzir(String obra){
        System.out.println("Reproduzindo " + obra);
        setTotalReproducao(getTotalReproducao() + 1);
    }
}
