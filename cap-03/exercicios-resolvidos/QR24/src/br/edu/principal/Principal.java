package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double horario = scanner.nextDouble();
        int hora = (int) horario;
        double min = horario - hora;
        double convertido = hora * 60 + min * 100;
        System.out.println(convertido);
    }

}
