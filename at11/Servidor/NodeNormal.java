package at11.Servidor;

import at11.Servidor.superPack.ContaBancaria;

public class NodeNormal {
    NodeNormal next;
    ContaBancaria contaBancaria;

    public NodeNormal(ContaBancaria conta) {
        this.contaBancaria = conta;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public NodeNormal getNext() {
        return next;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public void setNext(NodeNormal next) {
        this.next = next;
    }
}
