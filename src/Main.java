//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        Filme filme1 = new Filme();

        filme1.setNome("Homem-Aranha no Aranhaverso");
        filme1.setAnoDeLancamento(2018);
        filme1.setDuracaoEmMinutos(116);
        filme1.setIncluidoNoPlano(true);

        filme1.avalia(9);
        filme1.avalia(8);
        filme1.avalia(10);

        filme1.exibeFichaTecnica();
        filme1.pegaMedia();

    }
}
