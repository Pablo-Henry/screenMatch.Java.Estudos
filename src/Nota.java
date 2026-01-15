import java.util.Scanner;

public class Nota {
    //atributos da classe
    private String nome;
    private double[] notas = new double[5];
    //variáveis
    private double media = 0;
    private double soma = 0;
    Scanner sc = new Scanner(System.in);

    public Nota(String nome){
        this.nome = nome;
    }

    public double calculaMedia(){
        for (int i = 0; i < this.notas.length; i++) {
            System.out.printf("Informe sua %d nota: ", i + 1);
            double nota = sc.nextDouble();
            notas[i] = nota;
            soma+=nota;
        }

        return media = soma / notas.length;

    }

    public void exibeInfos(){
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Notas:");
        for (double nota : notas) {
            System.out.printf(" %.1f |", nota);
        }

        System.out.printf("%nMédia: %.1f%n", media);

        if (media < 6 && media > 3) {
            System.out.println("Recuperação!");
        } else if (media <= 3) {
            System.out.println("Reprovado!");
        } else{
            System.out.println("Aprovado!");
        }
    }
}
