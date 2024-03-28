package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("quilos: ");
        double pesoSaco = scanner.nextDouble();
        System.out.print("gramas: ");
        double racaoDiaria = scanner.nextDouble();

        double pesoRestanteSaco = (pesoSaco * 1000) - (racaoDiaria * 5);
        System.out.printf("%.2fkg", pesoRestanteSaco);


    }

}
