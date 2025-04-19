package carro;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    private static Carro carro = new Carro();
    private static OperacoesCarro operacoes = new OperacoesCarro(carro);

    public static void main(String[] args) {
        int op;

        do {
            System.out.println("\nMenu de opções do Carro:");
            System.out.println("\t1 - Ligar carro");
            System.out.println("\t2 - Desligar carro");
            System.out.println("\t3 - Acelerar");
            System.out.println("\t4 - Reduzir velocidade");
            System.out.println("\t5 - Trocar marcha");
            System.out.println("\t6 - Virar carro");
            System.out.println("\t7 - Verificar velocidade");
            System.out.println("\t8 - Verificar marcha");
            System.out.println("\t0 - Sair");
            System.out.print("\nDigite a opção desejada: ");
            op = input.nextInt();
            input.nextLine();

            switch (op) {
                case 1:
                	operacoes.ligarCarro(); 
                	break;
                case 2:
                	operacoes.desligarCarro();
                	break;
                case 3:
                	operacoes.acelerarCarro(); 
                	break;
                case 4: 
                	operacoes.reduzirVelocidadeCarro(); 
                	break;
                case 5: 
                    System.out.print("Digite a marcha desejada (0 a 6): ");
                    int marcha = input.nextInt();
                    operacoes.trocarMarcha(marcha);
                    break;
                case 6: 
                    System.out.print("Digite a direção (esquerda/direita): ");
                    String direcao = input.nextLine().toLowerCase();
                    operacoes.virarCarro(direcao);
                    break;
                case 7: 
                	operacoes.verificarVelocidade(); 
                	break;
                case 8: 
                	operacoes.verificarMarcha(); 
                	break;
                case 0: 
                	System.out.println("Programa encerrado"); 
                	break;
                default: 
                	System.out.println("Opção inválida");
            }
        } while (op != 0);
    }
}
