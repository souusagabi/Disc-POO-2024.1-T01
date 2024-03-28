package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioB = scanner.nextDouble();
        double salarioFinal = (salarioB * 1.05) - (salarioB * 0.07);
        System.out.printf("%.2f", salarioFinal);
    }

}
