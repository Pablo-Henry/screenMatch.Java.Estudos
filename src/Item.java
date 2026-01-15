public class Item {
    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void venda(int quantidade) {
        if (this.quantidade >= quantidade) {
            int novaQuantidade = this.quantidade -= quantidade;
            this.setQuantidade(novaQuantidade);
            System.out.println("Venda realizada com sucesso!");
            System.out.printf("Quantidade em estoque: %d%n%n", this.quantidade);
        } else {
            System.out.println("Quantidade em estoque insuficiente!\n");
        }

    }

    public void exibeInfos() {
        System.out.printf("Nome do Item: %s%n", this.nome);
        System.out.printf("Quantidade em estoque: %d%n%n", this.quantidade);
    }
}
