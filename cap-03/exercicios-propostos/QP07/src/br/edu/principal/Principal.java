
package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso = sc.nextDouble();
        System.out.println(peso * 1.15);
        System.out.println(peso * 0.8);
    }

}

