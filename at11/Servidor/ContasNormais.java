package at11.Servidor;

import at11.Servidor.superPack.ContaBancaria;

public class ContasNormais {
    NodeNormal head;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(ContaBancaria conta) {
        if (isEmpty()) {
            head = new NodeNormal(conta);
        } else {
            NodeNormal first = head;
            NodeNormal newNode = new NodeNormal(conta);
            newNode.next = head;
            first.next = head.getNext();
            this.head = newNode;
        }
    }

    public ContaBancaria search(int value) {
        if (isEmpty()) {
            return null;
        } else {
            NodeNormal n = head;
            if (n.getContaBancaria().getNumeroDaConta() == value) {
                return n.getContaBancaria();
            } else {
                while (n.getContaBancaria().getNumeroDaConta() == value) {
                    if (n.getNext() == null) {
                        return null;
                    }
                    n = n.getNext();
                }
            }
            return n.getContaBancaria();
        }
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Não há contas normais cadastradas no sistema");
        } else {
            NodeNormal n = head;
            System.out.println("Contas normais");
            while (n.getNext() != null) {
                System.out.println("Número da conta: " + n.getContaBancaria().getNumeroDaConta() + " Nome do usúario: "
                        + n.getContaBancaria().getNomeCliente() + " Saldo: " + n.getContaBancaria().getSaldo());
                n = n.getNext();
            }
            System.out.println("Número da conta: " + n.getContaBancaria().getNumeroDaConta() + " Nome do usúario: "
                    + n.getContaBancaria().getNomeCliente() + " Saldo: " + n.getContaBancaria().getSaldo());
        }
    }

    public NodeNormal getHead() {
        return head;
    }
}
