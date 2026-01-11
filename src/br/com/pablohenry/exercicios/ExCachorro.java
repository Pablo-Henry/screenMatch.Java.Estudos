package br.com.pablohenry.exercicios;

public class ExCachorro extends ExAnimal{

    public ExCachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au au au au");
    }

    public void abanarRabo(){
        System.out.println("Abanando rabo...\n");
    }

}
