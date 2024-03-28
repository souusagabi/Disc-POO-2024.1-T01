package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double custoEspetaculo = scanner.nextDouble();
        double custoIngresso = scanner.nextDouble();
        double ingressosNecessarios = custoEspetaculo / custoIngresso;
        System.out.println(ingressosNecessarios);
    }

}
