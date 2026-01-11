package br.com.pablohenry.exercicios;

public class ExModeloCarro extends ExCarro2{

    private String nome;
    private int ano;
    private String cor;

    public ExModeloCarro(String nome, int ano, String cor, String modelo, double precoPrimeiroAno, double precoSegundoAno, double precoTerceiroAno){
        super(modelo, precoPrimeiroAno, precoSegundoAno, precoTerceiroAno);
        this.nome = nome;
        this.ano = ano;
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public void setAno(int newAno) {
        this.ano = newAno;
    }

    public void setCor(String newCor) {
        this.cor = newCor;
    }

    public void fichaTecnica(){
        System.out.println("Nome do carro: " + nome);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
        System.out.println("Preço no primeiro ano: " + this.getPrecoPrimeiroAno() + "| Preço no segundo ano: " + this.getPrecoSegundoAno() + "| Preço no terceiro ano: " + this.getPrecoTerceiroAno());
        System.out.println("Cor do carro: " + cor);
        System.out.println("Modelo do carro: " + this.getModelo());
        System.out.println("Maior Preço: " + this.calculaMaiorPreco());
        System.out.println("Menor Preço: " + this.calculaMenorPreco() + "\n");

    }

}
