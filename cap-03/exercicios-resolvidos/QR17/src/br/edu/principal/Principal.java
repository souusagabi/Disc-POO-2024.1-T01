package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        double salario = scanner.nextDouble();
        double chq1 = scanner.nextDouble();
        double chq2 = scanner.nextDouble();

        double cpmf1 = chq1 * (0.38/100);
        double cpmf2 = chq2 * (0.38/100);
        double saldo = salario - chq1 - chq2 - cpmf1 - cpmf2;
        System.out.printf("%.2f", saldo);
    }

}
