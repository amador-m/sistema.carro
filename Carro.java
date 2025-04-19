package carro;

public class Carro {
    private boolean ligado;
    private int velocidade, marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0; // ponto morto
    }

    public boolean estaLigado() {
        return ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado");
        } else {
            System.out.println("O carro já está ligado");
        }
    }

    public void desligar() {
        if (ligado == true && marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("O carro foi desligado");
        } else {
            System.out.println("O carro só pode ser desligado se estiver parado e em ponto morto");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado! Ligue primeiro");
            return;
        } if (marcha == 0) {
            System.out.println("O carro está em ponto morto, troque a marcha antes de acelerar");
            return;
        }
        if (velocidade < 120) {
            velocidade++;
            System.out.printf("O carro acelerou. Velocidade atual: %d km/h\n", velocidade);
        } else {
            System.out.println("O carro já está na velocidade máxima (120 km/h)");
        }
    }

    public void reduzirVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado");
            return;
        }

        if (velocidade > 0) {
            velocidade--;
            System.out.printf("Reduzindo velocidade. Velocidade atual: %d km/h\n", velocidade);
        } else {
            System.out.println("O carro já está parado");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado, o ligue primeiro");
            return;
        } if ((novaMarcha - marcha) != 1) {
            System.out.println("Você só pode trocar para a marcha seguinte ou anterior");
            return;
        } if (!validarMarcha(novaMarcha)) { // false
            System.out.println("Velocidade incompatível com essa marcha");
            return;
        }
        marcha = novaMarcha;
        System.out.printf("Marcha trocada para %d\n", marcha);
    }

    private boolean validarMarcha(int novaMarcha) { // limites de velocidade por marcha
        if (novaMarcha == 0) {
        	return velocidade == 0;
        } if (novaMarcha == 1) {
        	return velocidade >= 0 && velocidade <= 20;
        } if (novaMarcha == 2) {
        	return velocidade >= 21 && velocidade <= 40;
        }  if (novaMarcha == 3) {
        	return velocidade >= 41 && velocidade <= 60;
        } if (novaMarcha == 4) {
        	return velocidade >= 61 && velocidade <= 80;
        } if (novaMarcha == 5) {
        	return velocidade >= 81 && velocidade <= 100;
        } if (novaMarcha == 6) {
        	return velocidade >= 101 && velocidade <= 120;
        } else {
        	return false;
        }
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado");
            return;
        } if (velocidade < 1 || velocidade > 40) {
            System.out.println("O carro só pode virar se estiver entre 1 e 40 km/h");
            return;
        }
        System.out.printf("O carro virou para %s\n", direcao);
    }
    
}
