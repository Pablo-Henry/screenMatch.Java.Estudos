package br.com.pablohenry.exercicios;

public class ExContaBancaria2 {
    /*
        Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
    */

    private String titular;
    private double saldo;

    public ExContaBancaria2(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double valor){
        return this.saldo += valor;
    }

    public double sacar(double valor){
        if(this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual: " + saldo);
        }
        return this.saldo;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
