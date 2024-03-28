package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int horas = scanner.nextInt();
        double salarioMin = scanner.nextDouble();

        double valorH = salarioMin / 2;
        double salarioBruto = horas * valorH;
        double imposto = 0.03 * salarioBruto;
        double salarioLiquido = salarioBruto - imposto;
        System.out.printf("%.2f", salarioLiquido);
    }

}
