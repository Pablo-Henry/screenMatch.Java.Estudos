package br.com.pablohenry.exerciciosV2;

public class ExProdutoFisico implements Calculavel {
    /*Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.*/

    @Override
    public double calcularPrecoFinal(int quantidade, double preco) {
        return quantidade * preco;
    }
}
