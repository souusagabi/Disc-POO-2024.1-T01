package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = scanner.nextDouble();
        double quilowattsConsumidos = scanner.nextDouble();

        double custoQuilowatt = salarioMinimo / 5;
        double custoEnergia = custoQuilowatt * quilowattsConsumidos;
        double custoEnergiaDesconto = custoEnergia * 0.85;

        System.out.println(custoQuilowatt);
        System.out.println(custoEnergia);
        System.out.println(custoEnergiaDesconto);
    }

}
