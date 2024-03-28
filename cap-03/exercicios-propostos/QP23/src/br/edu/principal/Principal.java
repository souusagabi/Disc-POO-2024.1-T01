
package br.edu.principal;


import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ang1 = sc.nextDouble();
        double ang2 = sc.nextDouble();
        double ang3 = 180 - (ang1 + ang2);
        System.out.println(ang3);
    }

}