package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int numb3 = scanner.nextInt();
        int numb4 = scanner.nextInt();

        int soma = numb1 + numb2 + numb3 + numb4;
        System.out.println(soma);
    }

}
