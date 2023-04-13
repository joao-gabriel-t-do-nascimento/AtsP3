package at11;

import java.util.Scanner;

import at11.Servidor.ContasEspeciais;
import at11.Servidor.ContasNormais;
import at11.Servidor.ContasPoupanca;
import at11.Servidor.superPack.ContaBancaria;
import at11.Servidor.superPack.sub.ContaEspecial;
import at11.Servidor.superPack.sub.ContaPoupanca;

public class Contas {
    public static void main(String[] args) {
        System.out.println("Digite 0 para criar nova conta");
        System.out.println("Digite 1 para Sacar dinheiro de uma conta");
        System.out.println("Digite 2 para depositar dinheiro de uma conta");
        System.out.println("Digite 3 para atulizar as contas poupança");
        System.out.println("Digite 4 para mostar o saldo em cada conta");
        ContasEspeciais contasEspeciais = new ContasEspeciais();
        ContasPoupanca contasPoupança = new ContasPoupanca();
        ContasNormais contasNormais = new ContasNormais();
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);

        char resp = 's';
        int leitor;
        double deposito, saque;
        int num;

        while (resp == 's') {
            System.out.println("Que operação deseja realizar?");
            leitor = in.nextInt();

            char tipo;
            switch (leitor) {
                case 0:
                    System.out.println(
                            "Que tipo de conta você deseja adicionar? n para normal, e para especial e p para poupança");
                    tipo = inStr.next().charAt(0);
                    tipo = Character.toLowerCase(tipo);
                    while (tipo != 'n' && tipo != 'e' && tipo != 'p') {
                        System.out.println("Tipo de conta inválido, digite novamente");
                        tipo = inStr.next().charAt(0);
                        tipo = Character.toLowerCase(tipo);
                    }
                    System.out.println("Digite o nome do usuário da conta");
                    String nome = inStr.next();

                    switch (tipo) {
                        case 'n':
                            ContaBancaria newContaBancaria = new ContaBancaria(nome);
                            contasNormais.addFirst(newContaBancaria);
                            break;

                        case 'p':
                            ContaPoupanca newContaPoupanca = new ContaPoupanca(nome);
                            contasPoupança.addFirst(newContaPoupanca);
                            break;
                        case 'e':
                            ContaEspecial newContaEspecial = new ContaEspecial(nome);
                            contasEspeciais.addFirst(newContaEspecial);
                            break;
                        default:
                            break;
                    }
                    break;
                case 1:
                    System.out.println("Tipo da conta? n para normal, e para especial e p para poupança");
                    tipo = inStr.next().charAt(0);
                    tipo = Character.toLowerCase(tipo);
                    while (tipo != 'n' && tipo != 'e' && tipo != 'p') {
                        System.out.println("Tipo de conta inválido, digite novamente");
                        tipo = inStr.next().charAt(0);
                        tipo = Character.toLowerCase(tipo);
                    }
                    System.out.println("Digite o número da conta");
                    num = inStr.nextInt();

                    switch (tipo) {
                        case 'n':
                            if (contasNormais.search(num) == null) {
                                System.out.println("Conta não encontrada");
                            } else {
                                System.out.println("Valor a ser sacado");
                                saque = inStr.nextDouble();
                                contasNormais.search(num).sacar(saque);
                            }
                            break;
                        case 'p':
                            if (contasPoupança.search(num) == null) {
                                System.out.println("Conta não encontrada");
                            } else {
                                System.out.println("Valor a ser sacado");
                                saque = inStr.nextDouble();
                                contasPoupança.search(num).sacar(saque);
                            }
                            break;
                        case 'e':
                            if (contasEspeciais.search(num) == null) {
                                System.out.println("Conta não encontrada");
                            } else {
                                System.out.println("Valor a ser sacado");
                                saque = inStr.nextDouble();
                                contasEspeciais.search(num).sacar(saque);
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Tipo da conta? n para normal, e para especial e p para poupança");
                    tipo = inStr.next().charAt(0);
                    tipo = Character.toLowerCase(tipo);
                    while (tipo != 'n' && tipo != 'e' && tipo != 'p') {
                        System.out.println("Tipo de conta inválido, digite novamente");
                        tipo = inStr.next().charAt(0);
                        tipo = Character.toLowerCase(tipo);
                    }
                    System.out.println("Digite o número da conta");
                    num = inStr.nextInt();

                    switch (tipo) {
                        case 'n':
                            if (contasNormais.search(num) == null) {
                                System.out.println("Conta não encontrada");
                            } else {
                                System.out.println("Valor a ser depositado");
                                deposito = inStr.nextDouble();
                                contasNormais.search(num).depositar(deposito);
                            }
                            break;
                        case 'p':
                            if (contasPoupança.search(num) == null) {
                                System.out.println("Conta não encontrada");
                            } else {
                                System.out.println("Valor a ser sacado");
                                deposito = inStr.nextDouble();
                                contasPoupança.search(num).depositar(deposito);
                            }
                            break;
                        case 'e':
                            if (contasEspeciais.search(num) == null) {
                                System.out.println("Conta não encontrada");
                            } else {
                                System.out.println("Valor a ser sacado");
                                deposito = inStr.nextDouble();
                                contasEspeciais.search(num).depositar(deposito);
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    if (contasPoupança.isEmpty()) {
                        System.out.println("Não há contas poupança no sistema");
                    } else {
                        contasPoupança.atulizarContas();
                    }
                    break;
                case 4:
                    if (contasEspeciais.isEmpty() && contasNormais.isEmpty() && contasPoupança.isEmpty()) {
                        System.out.println("Crie contas primeiro");
                    } else {
                        contasEspeciais.show();
                        contasNormais.show();
                        contasPoupança.show();
                    }
                    break;
                default:
                    break;
            }

            System.out.println("Deseja realizar outra operação? s/n");
            resp = in.next().charAt(0);
            resp = Character.toLowerCase(resp);
            while (resp != 's' && resp != 'n') {
                System.out.println("Opção inválida digite novamente");
                resp = in.next().charAt(0);
                resp = Character.toLowerCase(resp);
            }

        }
        in.close();
        inStr.close();
    }
}
