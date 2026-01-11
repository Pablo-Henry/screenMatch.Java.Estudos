package br.com.pablohenry.exerciciosV2;

public class ExConversorTemperatura implements ConversorTemperatura {
    /*Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
     */

    @Override
    public double celsiusParaFahrenheit(double temperatura){
        //F = (C * 1,8) + 32
        return ( temperatura * 1.8 ) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperatura){
        //C = (F - 32) / 1,8
        return ( temperatura - 32 ) / 1.8;
    }
}
