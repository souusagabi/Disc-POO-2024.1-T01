package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double novoSalario = salario * 1.25;
        System.out.printf("%.2f", novoSalario);
    }

}
