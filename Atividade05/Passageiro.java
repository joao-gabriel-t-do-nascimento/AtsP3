package AppMob;

public class Passageiro extends Utils {
    private double saldo, distancia;

    public Passageiro(String nome, Double distancia, double saldo) {
        super(nome);
        this.saldo = saldo;
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return this.nome;
    }

    void passageiroShowInfo() {
        System.out.println("Nome: " + this.nome + ", distancia: " + this.distancia + ", saldo: " + this.saldo);
    }

    public void pagarMotorista(Double valorDaCorrida) {
        saldo = saldo - valorDaCorrida;
    }
}
