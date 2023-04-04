import java.util.Scanner;

public class MainCircunferencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio");
        double raio = in.nextDouble();
        System.out.println("Digite a coordenada X do centro do círculo");
        double centroX = in.nextDouble();
        System.out.println("Digite a coordenada Y do centro do círculo");
        double centroY = in.nextDouble();

        Circunferencia circulo = new Circunferencia(raio, centroX, centroY);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a coordenada X do centro do ponto");
            double pontoX = in.nextDouble();
            System.out.println("Digite a coordenada Y do centro do ponto");
            double pontoY = in.nextDouble();
            System.out.println();
            circulo.verificar(pontoX, pontoY);
            System.out.println();
        }
        in.close();
    }
}
