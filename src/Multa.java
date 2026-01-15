public class Multa {
    private String titulo;
    private double valorLivro;
    private int diasDeAtraso;

    public Multa(String titulo, double valorLivro, int diasDeAtraso) {
        this.titulo = titulo;
        this.valorLivro = valorLivro;
        this.diasDeAtraso = diasDeAtraso;
    }

    private double multa() {
        double valorMulta = (double)2.5F;
        return valorMulta * (double)this.diasDeAtraso;
    }

    public void exibeInfos() {
        if (this.diasDeAtraso != 0) {
            System.out.printf("Titulo: %s | ", this.titulo);
            System.out.printf("Valor do Livro: %.2f | ", this.valorLivro);
            System.out.printf("Dias de Atraso: %d | ", this.diasDeAtraso);
            System.out.printf("Valor da multa por atraso: %.2f%n", this.multa());
            double var10001 = this.valorLivro;
            System.out.println("Total: " + (var10001 + this.multa()) + "\n");
        } else {
            System.out.printf("Titulo: %s | ", this.titulo);
            System.out.printf("Valor do Livro: %.2f%n", this.valorLivro);
            System.out.println("Total: " + this.valorLivro + "\n");
        }
    }
}
