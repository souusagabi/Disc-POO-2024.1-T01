package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioB = scanner.nextDouble();
        double salarioF = salarioB + 50 - (salarioB * 0.1);
        System.out.printf("%.2f", salarioF);
    }

}
