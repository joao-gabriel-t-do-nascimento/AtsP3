package AppMob;

public class Motorista extends Utils {
    double valorDaCorrida;

    public Motorista(String nome) {
        super(nome);
    }

    public Boolean aceitarCorrida(double saldo, double distancia) {
        valorDaCorrida = distancia * 2.5;
        if (saldo >= valorDaCorrida) {
            return true;
        } else {
            return false;
        }
    }

    public double getValorDaCorrida() {
        return this.valorDaCorrida;
    }

}
