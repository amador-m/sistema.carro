package carro;

public class OperacoesCarro {
    private Carro carro;

    public OperacoesCarro(Carro carro) {
        this.carro = carro;
    }

    public void ligarCarro() {
        carro.ligar();
    }

    public void desligarCarro() {
        carro.desligar();
    }

    public void acelerarCarro() {
        carro.acelerar();
    }

    public void reduzirVelocidadeCarro() {
        carro.reduzirVelocidade();
    }

    public void trocarMarcha(int novaMarcha) {
        carro.trocarMarcha(novaMarcha);
    }

    public void virarCarro(String direcao) {
        carro.virar(direcao);
    }

    public void verificarVelocidade() {
        System.out.printf("Velocidade atual: %d km/h\n", carro.getVelocidade());
    }

    public void verificarMarcha() {
        System.out.printf("Marcha atual: %d\n", carro.getMarcha());
    }
}
