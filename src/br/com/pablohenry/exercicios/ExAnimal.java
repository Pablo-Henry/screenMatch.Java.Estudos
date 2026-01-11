package br.com.pablohenry.exercicios;

public class ExAnimal {
    /*
        Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
     */

    private String nome;

    public ExAnimal(String nome){
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("Som genérico");
    }

}
