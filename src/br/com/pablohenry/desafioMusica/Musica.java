package br.com.pablohenry.desafioMusica;

public class Musica extends Audio implements Interacoes{

    public Musica(String titulo, String autor, int duracao){
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
