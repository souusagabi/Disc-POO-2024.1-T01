package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double graus = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double radianos = Math.toRadians(graus);

        double medidaEscada = altura / Math.sin(radianos);
        System.out.printf("%.2f", medidaEscada);
    }

}
