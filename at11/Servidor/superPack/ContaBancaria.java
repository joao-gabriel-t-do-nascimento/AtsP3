package at11.Servidor.superPack;

public class ContaBancaria {
    protected String nomeCliente;
    protected int numeroDaConta = 0;
    protected double saldo = 0;

    public ContaBancaria(String nome) {
        this.nomeCliente = nome;
        for (char c : nomeCliente.toCharArray()) {
            numeroDaConta = numeroDaConta + c + 17000;
        }
        System.out.println("O número da conta é: " + numeroDaConta);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double saque) {
        if (saque > saldo) {
            System.out.println("Não é possível sacar esse valor com o saldo atual");
        } else {
            this.saldo = this.saldo - saque;
        }
    }

    public void depositar(double deposito) {
        if (deposito <= 0) {
            System.out.println("Deposite um valor acima de 0");
        } else {
            this.saldo = this.saldo + deposito;
        }
    }
}
