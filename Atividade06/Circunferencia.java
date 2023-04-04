public class Circunferencia {
    private double raio;
    private double centroX;
    private double centroY;

    public Circunferencia(double raio, double centroX, double centroY) {
        this.raio = raio;
        this.centroX = centroX;
        this.centroY = centroY;
    }

    public void verificar(double pontoX, double pontoY) {
        double catetoAdjacente = centroX - pontoX;
        double catetoOposto = centroY - pontoY;
        double hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2));
        if (hipotenusa < raio) {
            System.out.println("O ponto está dentro da circûnferência");
        } else {
            System.out.println("O ponto está fora da circûnferência");
        }
    }
}
