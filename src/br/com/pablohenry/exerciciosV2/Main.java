package br.com.pablohenry.exerciciosV2;

public class Main {
    public static void main(String[] args) {
        ExConversorMoeda conversorMoeda = new ExConversorMoeda();
        System.out.println("R$" + conversorMoeda.converterDolarParaReal(500) + "\n");

        ExConversorTemperatura conversorTemperatura = new ExConversorTemperatura();
        System.out.println("Farenheit: " + conversorTemperatura.celsiusParaFahrenheit(23));
        System.out.println("Celsius: " + conversorTemperatura.fahrenheitParaCelsius(76.2) + "\n");

        ExCalculadoraSalaRetangular calculadoraSalaRetangular = new ExCalculadoraSalaRetangular();
        System.out.println(calculadoraSalaRetangular.calculaArea(5, 4) + "cm");
        System.out.println(calculadoraSalaRetangular.calculaPerimetro(2.5, 2) + "cm" + "\n");;

        ExTabuadaMultiplicacao tabuada = new ExTabuadaMultiplicacao();
        tabuada.realizaTabuada(7);

        ExLivro livro = new ExLivro();
        System.out.println("\nR$" + livro.calcularPrecoFinal(4, 59.99));
        System.out.println("R$" + livro.calcularPrecoFinal(1, 59.99));

    }
}
