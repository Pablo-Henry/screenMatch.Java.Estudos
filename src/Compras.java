public class Compras {
    private String nome;
    private double preco;
    private int quantidade;

    public Compras(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalProduto() {
        return (double)this.quantidade * this.preco;
    }

    public void exibeCompras() {
        System.out.printf("Produto: %s | ", this.nome);
        System.out.printf("Preço: %.2f | ", this.preco);
        System.out.printf("Quantidade: %d%n", this.quantidade);
    }
}
