package br.com.pablohenry.exercicios;

public class ExProduto {
    /*
        Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar
        e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
    */

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double newPreco) {
        this.preco = newPreco;
    }

    public double aplicarDesconto(){
        return preco * 0.90;
    }

}
