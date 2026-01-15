public class Temperatura {
    private String local;
    private double temperaturaAtual;

    public Temperatura(String local, double temperaturaAtual) {
        this.local = local;
        this.temperaturaAtual = temperaturaAtual;
    }

    private void alerta() {
        if (this.temperaturaAtual > 37.5) {
            System.out.println("Temperatura acima do limite!\n");
        } else {
            System.out.println("Temperatura dentro do padrão\n");
        }
    }

    public void exibeTemperatura() {
        System.out.printf("Local do Sensor: %s%n", this.local);
        System.out.printf("Temperatura: %.1f C°%n", this.temperaturaAtual);
        alerta();
    }
}

