package br.com.pablohenry.exercicios;

import java.util.Scanner;

public class ExAluno2 {
    /*Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
    */

    private String nome;
    private double[] notas = new double[5];

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(){
        double notas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 notas");
        for (int i = 0; i < this.notas.length; i++){
            notas = sc.nextDouble();
            this.notas[i] = notas;
        }
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public double calcularMedia(){
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        return soma / notas.length;

    }
}
