package br.com.pablohenry.exercicios;

public class ExContaBancaria {
    /*
        Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
        Implemente métodos getters e setters para os atributos privados.
    */

    private int numeroConta;
    private int saldo;
    private String titular;

    public int getNumeroConta(){
        return numeroConta;
    }

    public int getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setNumeroConta(int newNumeroConta){
        this.numeroConta = newNumeroConta;
    }

    public void setSaldo(int newSaldo){
        this.saldo = newSaldo;
    }

    public void setTitular(String newTitular){
        this.titular = newTitular;
    }


}
