package br.com.pablohenry.desafioMusica;

public class Audio {
    private String titulo;
    private String autor;
    private int duracao;
    private int curtidas;
    private int totalReproducao;

    public Audio(String titulo, String autor, int duracao){
        this.titulo = titulo;
        this.autor = autor;
        this.duracao = duracao;
    }


    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String newTitulo){
        this.titulo = newTitulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String newAutor){
        this.autor = newAutor;
    }

    public int getDuracao(){
        return this.duracao;
    }

    public void setDuracao(int newDuracao){
        this.duracao = newDuracao;
    }

    public int getCurtidas(){
        return this.curtidas;
    }

    public void setCurtidas(int newCurtidas){
        this.curtidas = newCurtidas;
    }

    public int getTotalReproducao(){
        return this.totalReproducao;
    }

    public void setTotalReproducao(int newTotalReproducao){
        this.totalReproducao = newTotalReproducao;
    }

    public void infos(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Duração: " + getDuracao() + " Segundos");
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Total de reproduções: " + getTotalReproducao() + "\n");
    }

}
