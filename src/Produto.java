public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostrarProduto() {
        System.out.println("Nome do produto: " + this.nome);
        System.out.printf("Valor: R$%.2f\n", this.preco);
        System.out.println("Quantidade: " + this.quantidade + "\n");
    }
}
