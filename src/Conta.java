public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual: R$%.2f%n%n", this.saldo);
    }

    public double zerarSaldo() {
        return this.saldo = 0.0;
    }
}
