package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double r1 = Math.pow(n1, n2);
        double r2 = Math.pow(n2, n1);
        System.out.printf("%.2f ---- %.2f", r1, r2);
    }

}
