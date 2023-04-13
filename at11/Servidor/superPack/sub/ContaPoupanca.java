package at11.Servidor.superPack.sub;

import at11.Servidor.superPack.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String nome) {
        super(nome);
    }

    private Double taxaDeRendimento = 0.42;

    public Double getTaxa_de_rendimento() {
        return taxaDeRendimento;
    }

    public void setTaxa_de_rendimento(Double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void atualiza() {
        this.saldo = this.saldo * taxaDeRendimento;
    }
}
