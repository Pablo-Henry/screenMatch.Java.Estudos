package br.com.pablohenry.exercicios;

public class MainExercicios {
    static void main(String[] args) {
        ExPessoa pessoa = new ExPessoa();
        pessoa.exibeMensagem();

        ExCalculadora calculadora = new ExCalculadora();
        System.out.println(calculadora.retornaDobro(888) + "\n");

        ExMusica newMusica = new ExMusica();
        newMusica.titulo = "Black Hole Sun";
        newMusica.artista = "Soundgarden";
        newMusica.anoLancamento = 1994;
        newMusica.avalia(9.5);
        newMusica.avalia(7.5);
        newMusica.avalia(6);
        newMusica.avalia(8);
        newMusica.exibeFicha();

        ExCarro newCarro = new ExCarro();
        newCarro.modelo = "Vectra Elite";
        newCarro.ano = 2005;
        newCarro.cor = "Prata";
        newCarro.exibeFicha();

        ExAluno newAluno = new ExAluno();
        newAluno.nome = "Henry";
        newAluno.idade = 21;
        newAluno.exibeFicha();

        ExIdadePessoa pessoaIdade = new ExIdadePessoa();
        pessoaIdade.setNome("Laura");
        pessoaIdade.setIdade(7);
        pessoaIdade.verificarIdade();

        ExProduto produto = new ExProduto();
        produto.setNome("Mouse");
        produto.setPreco(200.00);
        System.out.println(produto.aplicarDesconto() + "\n");

        ExAluno2 alunoEx2 = new ExAluno2();
        alunoEx2.setNome("Henry");
        alunoEx2.setNotas();
        System.out.println("Média do aluno: " + alunoEx2.calcularMedia() + "\n");


        ExLivro livro = new ExLivro();
        livro.setTitulo("Como Fazer Amigos e Influenciar Pessoas");
        livro.setAutor("Dale Carnegie");
        livro.imprimeDados();

    }
}
