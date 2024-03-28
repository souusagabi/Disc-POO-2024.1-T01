package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double peso1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double peso2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double peso3 = scanner.nextDouble();

        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / peso1 + peso2 + peso3;
        System.out.printf("%.2f", media);
    }

}
