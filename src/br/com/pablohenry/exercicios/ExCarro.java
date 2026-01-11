package br.com.pablohenry.exercicios;

import java.time.LocalDate;

public class ExCarro {
    //Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

    String modelo;
    int ano;
    String cor;


    public void exibeFicha(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade do Veiculo: " + calculaIdade(ano) + "\n");
    }

    public int calculaIdade(int anoDoVeiculo){
        int anoAtual = LocalDate.now().getYear(); // pega o ano atual
        return anoAtual - ano;
    }

}
