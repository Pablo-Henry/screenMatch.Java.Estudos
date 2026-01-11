package br.com.pablohenry.exercicios;

public class ExIdadePessoa {
    /*
        Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar
        e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
    */

    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public void verificarIdade(){
        if( idade >= 18 ) {
            System.out.println("Maior de Idade!\n");
        } else {
            System.out.println("Menor de Idade\n");
        }
    }


}
