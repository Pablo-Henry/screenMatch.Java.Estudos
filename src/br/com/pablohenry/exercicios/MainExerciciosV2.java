package br.com.pablohenry.exercicios;

public class MainExerciciosV2 {
    static void main(String[] args) {
        ExCarro2 carro = new ExCarro2("Hatch", 16.500, 18.000, 20.250);


        ExModeloCarro modeloCarro = new ExModeloCarro("Astra", 2011, "Vermelho" , "Hatch", 16.500, 18.000, 20.250 );
        modeloCarro.fichaTecnica();

        ExCachorro cachorro = new ExCachorro("Shanks");
        cachorro.emitirSom();
        cachorro.abanarRabo();

        ExGato gato = new ExGato("Skadi");
        gato.emitirSom();
        gato.arranharMoveis();

        ExContaCorrente contaCorrente = new ExContaCorrente("Pablo Henry", 4500);
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(500);
        contaCorrente.consultarSaldo();

        contaCorrente.depositar(500);
        contaCorrente.consultarSaldo();
        contaCorrente.cobrarTarifaMensal();

    }
}
