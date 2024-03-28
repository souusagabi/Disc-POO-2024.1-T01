package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pes = scanner.nextDouble();
        double polegadas = pes * 12;
        double jardas = pes / 3;
        double milhas = jardas / 1.76;

        System.out.printf("%.2f --- %.2f --- %.2f", polegadas, jardas, milhas);
    }

}
