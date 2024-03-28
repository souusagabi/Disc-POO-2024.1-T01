package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = scanner.nextInt();
        double quad = Math.pow(numb, 2);
        double cub = Math.pow(numb, 3);
        double raizQ = Math.sqrt(numb);
        double raizC = Math.pow(numb, 1.0/3);

        System.out.printf("%.2f%n", quad);
        System.out.printf("%.2f%n", cub);
        System.out.printf("%.2f%n", raizQ);
        System.out.printf("%.2f%n", raizC);
    }

}
