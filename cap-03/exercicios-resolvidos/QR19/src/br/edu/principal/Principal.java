package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double alturaDegrau = scanner.nextDouble();
        double alturaSubir = scanner.nextDouble();
        int degraus = (int) (alturaSubir / alturaDegrau);
        System.out.println(degraus);
    }

}
