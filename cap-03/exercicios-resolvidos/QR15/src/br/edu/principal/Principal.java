package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        double precoFabrica = scanner.nextDouble();
        double percentualLucro = scanner.nextDouble();
        double percentualImps = scanner.nextDouble();

        double lucro = precoFabrica * percentualLucro;
        double impostos = precoFabrica * percentualImps;
        double precoFinal = precoFabrica + lucro + impostos;
        System.out.printf("lucro: R$%.2f%n", lucro);
        System.out.printf("impostos: R$%.2f%n", impostos);
        System.out.printf("preco final: R$%.2f%n", precoFinal);
    }

}
