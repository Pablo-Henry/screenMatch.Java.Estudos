package br.com.pablohenry.exerciciosV2;

public class ExTabuadaMultiplicacao implements Tabuada {

    /*Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.*/

    @Override
    public void realizaTabuada(int numero) {
        for ( int i = 0; i <= 10; i++ ) {
            System.out.println(numero + "*" + i + "=" + i * numero);
        }
    }

}
