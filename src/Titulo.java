public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int newAnoDeLancamento) {
        this.anoDeLancamento = newAnoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int newDuracaoEmMinutos) {
        this.duracaoEmMinutos = newDuracaoEmMinutos;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean newIncluidoNoPlano) {
        this.incluidoNoPlano = newIncluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
        System.out.println("Incluido no plano: " + getIncluidoNoPlano());
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Média de avaliações: " + pegaMedia());
    }

    public void avalia(int nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
