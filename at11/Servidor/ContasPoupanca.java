package at11.Servidor;

import at11.Servidor.superPack.sub.ContaPoupanca;

public class ContasPoupanca {
    NodePoupança head;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(ContaPoupanca conta) {
        if (isEmpty()) {
            head = new NodePoupança(conta);
        } else {
            NodePoupança first = head;
            NodePoupança newNode = new NodePoupança(conta);
            newNode.next = head;
            first.next = head.getNext();
            this.head = newNode;
        }
    }

    public ContaPoupanca search(int value) {
        if (isEmpty()) {
            return null;
        } else {
            NodePoupança n = head;
            if (n.getContaPoupanca().getNumeroDaConta() == value) {
                return n.contasPoupanca;
            } else {
                while (n.getContaPoupanca().getNumeroDaConta() == value) {
                    if (n.getNext() == null) {
                        return null;
                    }
                    n = n.getNext();
                }
            }
            return n.contasPoupanca;
        }

    }

    public void atulizarContas() {
        NodePoupança node = head;
        node.getContaPoupanca().atualiza();
        while (node.getNext() != null) {
            node = node.getNext();
            node.getContaPoupanca().atualiza();
        }
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Não há contas poupança cadastradas no sistema");
        } else {
            NodePoupança n = head;
            System.out.println("Contas poupança");
            while (n.getNext() != null) {
                System.out.println("Número da conta: " + n.getContaPoupanca().getNumeroDaConta() + " Nome do usúario: "
                        + n.getContaPoupanca().getNomeCliente() + " Saldo: " + n.getContaPoupanca().getSaldo());
                n = n.getNext();
            }
            System.out.println("Número da conta: " + n.getContaPoupanca().getNumeroDaConta() + " Nome do usúario: "
                    + n.getContaPoupanca().getNomeCliente() + " Saldo: " + n.getContaPoupanca().getSaldo());
        }
    }

    public NodePoupança getHead() {
        return head;
    }
}
