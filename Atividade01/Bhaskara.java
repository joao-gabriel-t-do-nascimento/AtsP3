package Atividade01;

public class Bhaskara {
    public void bask(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta: " + delta);
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)), x2 = (-b - Math.sqrt(delta));
            System.out.println(
                    "X': " + x1 / (2 * a) + " " + "X'': " + x2 / (2 * a));
        } else {
            System.out.println("Delta inferior a 0, não há raizes");
        }
    }
}
