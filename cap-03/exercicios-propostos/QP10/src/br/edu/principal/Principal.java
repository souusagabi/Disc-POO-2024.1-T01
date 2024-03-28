
package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println(area);
    }
}
