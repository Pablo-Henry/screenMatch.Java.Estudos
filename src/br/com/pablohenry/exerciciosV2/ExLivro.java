package br.com.pablohenry.exerciciosV2;

public class ExLivro implements Calculavel {
    /*Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.*/

    @Override
    public double calcularPrecoFinal(int quantidade, double preco) {
        double precoFinal = 0;
        if ( quantidade >= 2 ) {
            double desconto = 0.95;
            precoFinal =  (quantidade * preco) * desconto;
        } else {
            precoFinal = quantidade * preco;
        }
        return precoFinal;
    }
}
