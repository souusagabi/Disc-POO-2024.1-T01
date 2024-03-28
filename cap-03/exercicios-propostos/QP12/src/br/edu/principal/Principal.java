
package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salMin = scanner.nextDouble();
        double salario = scanner.nextDouble();
        double qtdSalMin = salario / salMin;
        System.out.println(qtdSalMin);
    }

}
