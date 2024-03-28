package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numb = scanner.nextDouble();
        int parteInt = (int) numb;
        double parteFra = numb - parteInt;
        double arredondado = Math.round(numb);

        System.out.println(parteInt);
        System.out.println(parteFra);
        System.out.println(arredondado);


    }

}
