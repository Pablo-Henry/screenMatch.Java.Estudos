package br.com.pablohenry.exercicios;

public class ExContaCorrente extends ExContaBancaria2{

    public ExContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }

    public void cobrarTarifaMensal(){
        System.out.println("Tarifa mensal de 2% Cobrada!");
        this.setSaldo(this.getSaldo() - 0.98);
        System.out.println("Saldo: " + this.getSaldo());
    }

}
