import java.util.ArrayList;
public class Main {
    static void main(String[] args) {
        Produto produto = new Produto("Mouse", 622.5, 5);
        produto.mostrarProduto();

        Livro livro = new Livro("Como fazer amigos e influenciar pessoas", "Dale Carnegie", 268);
        livro.mostrarLivro();

        Conta conta = new Conta(9225.8);
        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();

        Temperatura temperatura = new Temperatura("Setor A", 32.5);
        temperatura.exibeTemperatura();

        Nota nota = new Nota("Aline");
        nota.calculaMedia();
        nota.exibeInfos();

        Funcionario funcionario = new Funcionario("Pablo Henry Farias Martins", "Desenvolvedor Junior", 1);
        funcionario.exibeDados();
        funcionario.promocao("Desenvolvedor Pleno", 2);
        funcionario.exibeDados();


        Tarefa tarefa = new Tarefa("Estudar Java", true);
        Tarefa tarefa2 = new Tarefa("Estudar POO", true);
        Tarefa tarefa3 = new Tarefa("Estudar Spring", false);

        ArrayList <Tarefa> ListaDeTarefas = new ArrayList<>();
        ListaDeTarefas.add(tarefa);
        ListaDeTarefas.add(tarefa2);
        ListaDeTarefas.add(tarefa3);
        tarefa.exibeTarefasV2(ListaDeTarefas);

//        segundo forma de fazer.
//        for (Tarefa tar : ListaDeTarefas) {
//            tar.exibeTarefas();
//        }

        Item item = new Item("Placa de video", 10);
        item.venda(8);
        item.venda(3);
        item.exibeInfos();

        Multa multa = new Multa("Percy Jackson", 69.99, 7);
        multa.exibeInfos();

        Compras compras = new Compras("Superligth 2", 658.59, 1);
        Compras compras2 = new Compras("Havit hd2000", 158.59, 2);
        Compras compras3 = new Compras("Mouse pad Pk Control", 58.59, 4);

        double total = 0;
        ArrayList <Compras> ListaDeCompras = new ArrayList<>();
        ListaDeCompras.add(compras);
        ListaDeCompras.add(compras2);
        ListaDeCompras.add(compras3);

        for (Compras c : ListaDeCompras) {
            c.exibeCompras();
            total += c.valorTotalProduto();
        }

        System.out.printf("Total: %.2f%n%n", total);

    }
}
