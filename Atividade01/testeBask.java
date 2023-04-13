package Atividade01;

import java.util.Scanner;

public class testeBask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bhaskara calc = new Bhaskara();

        double a, b, c;

        System.out.println("digite o valor de A: ");
        a = in.nextDouble();
        System.out.println("digite o valor de B: ");
        b = in.nextDouble();
        System.out.println("digite o valor de C: ");
        c = in.nextDouble();
        in.close();

        calc.bask(a, b, c);
    }
}
