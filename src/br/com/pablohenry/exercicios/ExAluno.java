package br.com.pablohenry.exercicios;

public class ExAluno {
    /*
        Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno
        atribua valores aos seus atributos e utilize o método para exibir as informações.
    */

    String nome;
    int idade;

    public void exibeFicha(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade : " + idade + "\n");
    }

}
