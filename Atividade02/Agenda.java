package Atividade02;

import java.util.Scanner;

public class Agenda {
    public static boolean verificar(Long ncv) {
        if (ncv > 999999999 || ncv < 900000000) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner inLine = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);
        Scanner intLong = new Scanner(System.in);
        AgendaClass agenda = new AgendaClass();

        char quit = 'n';
        String nome;
        int option, remove;
        Long numero;

        System.out.println("Para sair digite 0");
        System.out.println("Para adicionar novo contato digite 1");
        System.out.println("Para verificar a lista de contatos digite 2");
        System.out.println("Para remover um contato digite 3");

        while (quit == 'n') {

            option = inInt.nextInt();
            while (option != 1 && option != 2 && option != 3 && option != 0) {
                System.out.println("Operação inválida, digite novamente");
                option = inInt.nextInt();
            }

            switch (option) {
                case 1:
                    System.out.println("Nome do contato:");
                    nome = inLine.nextLine();
                    System.out.println("número do contato:");
                    numero = intLong.nextLong();
                    while (verificar(numero)) {
                        System.out.println("número inválido, digite novamente");
                        numero = intLong.nextLong();
                    }
                    agenda.addContato(numero, nome);
                    break;
                case 2:
                    agenda.listar();
                    break;
                case 3:
                    System.out.println("Digite a posição do contato, na lista, que você deseja remover");
                    agenda.listar();
                    remove = inInt.nextInt();
                    agenda.remover(remove);
                    break;
                case 0:
                    System.out.println("deseja sair da agenda? s/n");
                    quit = inLine.nextLine().charAt(0);
                    quit = Character.toLowerCase(quit);
                    while (quit != 's' && quit != 'n') {
                        System.out.println("digite s ou n");
                        quit = inLine.nextLine().charAt(0);
                    }
                    break;
                default:
                    break;
            }
        }
        intLong.close();
        inInt.close();
        inLine.close();
    }
}
