package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tamanhoEsc = scanner.nextDouble();
        double alturaQd = scanner.nextDouble();
        double distancia = Math.pow( Math.pow(tamanhoEsc, 2) - Math.pow(alturaQd, 2) , 1.0/2);
        System.out.printf("%.2f", distancia);
    }

}
