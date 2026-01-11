public class Serie extends Titulo {


    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean ativa;

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setTemporadas(int newTemporadas) {
        this.temporadas = newTemporadas;
    }

    public void setEpisodiosPorTemporada(int newEpisodiosPorTemporada) {
        this.episodiosPorTemporada = newEpisodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int newMinutosPorEpisodio) {
        this.minutosPorEpisodio = newMinutosPorEpisodio;
    }

    public void setAtiva(boolean newAtiva) {
        this.ativa = newAtiva;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

}
