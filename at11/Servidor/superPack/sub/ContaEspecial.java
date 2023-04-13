package at11.Servidor.superPack.sub;

import at11.Servidor.superPack.ContaBancaria;

public class ContaEspecial extends ContaBancaria {
    private double limite = 800;

    public ContaEspecial(String nome) {
        super(nome);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double saque) {
        if (saque > this.saldo + limite) {
            System.out.println("Não é possível ultrapassar o limite!");
        } else {
            this.saldo = this.saldo - saque;
        }
    }
}
