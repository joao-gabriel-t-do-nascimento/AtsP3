package AppMob;

import java.util.Scanner;

public class Main {
    // Um bubbleSort para organizar os passageiros por próximidade em relação ao
    // motorista
    static void bubbleSortPassageiro(Passageiro[] passageiro) {
        for (int i = 0; i < passageiro.length; i++) {
            for (int j = 0; j < passageiro.length - 1; j++) {
                if (passageiro[j].getDistancia() > passageiro[j + 1].getDistancia()) {
                    Passageiro aux = passageiro[j];
                    passageiro[j] = passageiro[j + 1];
                    passageiro[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Passageiro[] passageiros;
        Motorista m1 = new Motorista("Seu João");

        // Uma tulha de Scanners desnecessária, mas que sem ela o código buga (fazer o
        // que né?)
        Scanner inInt = new Scanner(System.in);
        Scanner inDouble = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);

        String nome;
        Double distancia, saldo;

        System.out.println("Número de passageiros no sistema");
        passageiros = new Passageiro[inInt.nextInt()];

        // Um looping para inicializar os passageiros do vetor passageiros[]
        // A ideia é como se tivesse um banco de dados que envia informações
        // de distancia, nome e saldo para o app (sendo a distância do passageiro em
        // relação ao motorista)

        for (int i = 0; i < passageiros.length; i++) {
            System.out.print("Digite o nome do passageiro " + (i + 1) + " ");
            nome = inString.nextLine();
            System.out.println();
            System.out.print("Digite o distancia do passageiro " + (i + 1) + " ");
            distancia = inDouble.nextDouble();
            System.out.println();
            System.out.print("Digite o saldo do passageiro " + (i + 1) + " ");
            saldo = inDouble.nextDouble();

            passageiros[i] = new Passageiro(nome, distancia, saldo);
        }
        Main.bubbleSortPassageiro(passageiros);

        // algums souts para organizar a visão no terminal
        System.out.println();

        // e finalmente um looping que seleciona o passageiro

        for (int i = 0; i < passageiros.length; i++) {
            if (m1.aceitarCorrida(passageiros[i].getSaldo(), passageiros[i].getDistancia())) {
                System.out.println("Corrida aceita! Nome do passageiro: " + passageiros[i].getNome());
                passageiros[i].pagarMotorista(m1.valorDaCorrida);
                break;
            } else {
                System.out.println("Corrida recusada, nome do passageiro: " + passageiros[i].getNome());
            }
        }

        inDouble.close();
        inInt.close();
        inString.close();
    }
}
