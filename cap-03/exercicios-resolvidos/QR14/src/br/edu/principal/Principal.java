package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int anoAtual = scanner.nextInt();
        int anoNasc = scanner.nextInt();
        int idade = anoAtual - anoNasc;
        int idade50 = 2050 - anoNasc;
        System.out.printf("%d -- %d", idade, idade50);
    }

}
