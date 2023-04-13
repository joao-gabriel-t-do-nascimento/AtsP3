package at11.Servidor;

import at11.Servidor.superPack.sub.ContaPoupanca;

public class NodePoupança {
    ContaPoupanca contasPoupanca;
    NodePoupança next;

    public NodePoupança(ContaPoupanca conta) {
        this.contasPoupanca = conta;
    }

    public NodePoupança getNext() {
        return next;
    }

    public ContaPoupanca getContaPoupanca() {
        return contasPoupanca;
    }

    public void setContasPoupanca(ContaPoupanca contasPoupanca) {
        this.contasPoupanca = contasPoupanca;
    }

    public void setNext(NodePoupança next) {
        this.next = next;
    }
}