public class Funcionario {
    private String nome;
    private String cargo;
    private int nivelDeAcesso;

    public Funcionario(String nome, String cargo, int nivelDeAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public void promocao(String novoCargo, int novoNivelDeAcesso) {
        this.cargo = novoCargo;
        this.nivelDeAcesso = novoNivelDeAcesso;
        System.out.println("Atualização realizada com sucesso: ");
        System.out.printf("Novo Cargo: %s%n", this.cargo);
        System.out.printf("Novo Nível de Acesso: %s%n%n", this.nivelDeAcesso);
    }

    public void exibeDados() {
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Cargo atual: %s%n", this.cargo);
        System.out.printf("Nível de acesso: %d%n%n", this.nivelDeAcesso);
    }
}
