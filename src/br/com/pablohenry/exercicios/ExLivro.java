package br.com.pablohenry.exercicios;

public class ExLivro {
    /*Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
    */

    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String newAutor) {
        this.autor = newAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String newTitulo) {
        this.titulo = newTitulo;
    }

    public void imprimeDados(){
        System.out.println("Titulo: " + getTitulo() );
        System.out.println("Autor: " + getAutor() + "\n");
    }

}
