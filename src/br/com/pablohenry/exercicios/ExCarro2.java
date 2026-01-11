package br.com.pablohenry.exercicios;

public class ExCarro2 {
    /*
        Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
    */


    private String modelo;
    private double precoPrimeiroAno;
    private double precoSegundoAno;
    private double precoTerceiroAno;

    public ExCarro2(String modelo, double precoPrimeiroAno, double precoSegundoAno, double precoTerceiroAno){
        this.modelo = modelo;
        this.precoPrimeiroAno = precoPrimeiroAno;
        this.precoSegundoAno = precoSegundoAno;
        this.precoTerceiroAno = precoTerceiroAno;
    }

    public void nomeModelo(String modelo){
        this.modelo = modelo;
    }

    public void precoMedioPorAno(double precoPrimeiroAno, double precoSegundoAno, double precoTerceiroAno){
        this.precoPrimeiroAno = precoPrimeiroAno;
        this.precoSegundoAno = precoSegundoAno;
        this.precoTerceiroAno = precoTerceiroAno;
    }

    public double calculaMenorPreco(){
        double menorPreco = 0;
        if (this.precoPrimeiroAno < precoSegundoAno && precoPrimeiroAno < precoTerceiroAno) {
            menorPreco = precoPrimeiroAno;

        } else if (this.precoSegundoAno < precoPrimeiroAno && precoSegundoAno < precoTerceiroAno){
            menorPreco = precoSegundoAno;

        } else {
            menorPreco = precoTerceiroAno;
        }

        return menorPreco;
    }


    public double calculaMaiorPreco(){
        double maiorPreco = 0;
        if (this.precoPrimeiroAno > precoSegundoAno && precoPrimeiroAno > precoTerceiroAno) {
            maiorPreco = precoPrimeiroAno;

        } else if (this.precoSegundoAno > precoPrimeiroAno && precoSegundoAno > precoTerceiroAno){
            maiorPreco = precoSegundoAno;

        } else {
            maiorPreco = precoTerceiroAno;
        }

        return maiorPreco;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoPrimeiroAno() {
        return precoPrimeiroAno;
    }

    public void setPrecoPrimeiroAno(double precoPrimeiroAno) {
        this.precoPrimeiroAno = precoPrimeiroAno;
    }

    public double getPrecoSegundoAno() {
        return precoSegundoAno;
    }

    public void setPrecoSegundoAno(double precoSegundoAno) {
        this.precoSegundoAno = precoSegundoAno;
    }

    public double getPrecoTerceiroAno() {
        return precoTerceiroAno;
    }

    public void setPrecoTerceiroAno(double precoTerceiroAno) {
        this.precoTerceiroAno = precoTerceiroAno;
    }
}
