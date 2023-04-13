package Atividade05;

public class Motorista extends Utils {
    double valorDaCorrida;

    public Motorista(String nome) {
        super(nome);
    }

    public Boolean aceitarCorrida(double saldo, double distancia) {
        valorDaCorrida = distancia * 2.5;
        return saldo >= valorDaCorrida;
    }

    public double getValorDaCorrida() {
        return this.valorDaCorrida;
    }

}
