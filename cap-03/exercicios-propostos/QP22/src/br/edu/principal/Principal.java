
package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdLados = scanner.nextInt();
        int qtdDiagonais = (qtdLados * (qtdLados - 3)) / 2;
        System.out.println(qtdDiagonais);
    }

}
