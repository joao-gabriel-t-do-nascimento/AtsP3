package at11.Servidor;

import at11.Servidor.superPack.sub.ContaEspecial;

public class NodeEspecial {
    NodeEspecial next;
    ContaEspecial contaEspecial;

    public NodeEspecial(ContaEspecial conta) {
        this.contaEspecial = conta;
    }

    public NodeEspecial getNext() {
        return next;
    }

    public ContaEspecial getContaEspecial() {
        return contaEspecial;
    }

    public void setContaEspecial(ContaEspecial contaEspecial) {
        this.contaEspecial = contaEspecial;
    }

    public void setNext(NodeEspecial next) {
        this.next = next;
    }

}
