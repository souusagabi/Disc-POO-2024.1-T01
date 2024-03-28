package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposito = scanner.nextDouble();
        double taxa = scanner.nextDouble();
        double rendimento = deposito * taxa;
        double total = deposito + rendimento;
        System.out.printf("%.2f", total);
    }

}
