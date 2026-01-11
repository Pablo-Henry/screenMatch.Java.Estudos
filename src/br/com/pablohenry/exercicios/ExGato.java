package br.com.pablohenry.exercicios;

public class ExGato extends ExAnimal{

    public ExGato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau miau miau");
    }

    public void arranharMoveis(){
        System.out.println("Arranhando móvel...\n");
    }

}
