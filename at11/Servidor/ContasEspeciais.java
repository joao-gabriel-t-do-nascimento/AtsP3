package at11.Servidor;

import at11.Servidor.superPack.sub.ContaEspecial;

public class ContasEspeciais {
    NodeEspecial head;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(ContaEspecial conta) {
        if (isEmpty()) {
            head = new NodeEspecial(conta);
        } else {
            NodeEspecial first = head;
            NodeEspecial newNode = new NodeEspecial(conta);
            newNode.next = head;
            first.next = head.getNext();
            this.head = newNode;
        }
    }

    public ContaEspecial search(int value) {
        if (isEmpty()) {
            return null;
        } else {
            NodeEspecial n = head;
            if (n.getContaEspecial().getNumeroDaConta() == value) {
                return n.getContaEspecial();
            } else {
                while (n.getContaEspecial().getNumeroDaConta() == value) {
                    if (n.getNext() == null) {
                        return null;
                    }
                    n = n.getNext();
                }
            }
            return n.getContaEspecial();
        }
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Não há contas especiais cadastradas no sistema");
        } else {
            NodeEspecial n = head;
            System.out.println("Contas especiais");
            while (n.getNext() != null) {
                System.out.println("Número da conta: " + n.getContaEspecial().getNumeroDaConta() + " Nome do usúario: "
                        + n.getContaEspecial().getNomeCliente() + " Saldo: " + n.getContaEspecial().getSaldo());
                n = n.getNext();
            }
            System.out.println("Número da conta: " + n.getContaEspecial().getNumeroDaConta() + " Nome do usúario: "
                    + n.getContaEspecial().getNomeCliente() + " Saldo: " + n.getContaEspecial().getSaldo());
        }
    }

    public NodeEspecial getHead() {
        return head;
    }
}
