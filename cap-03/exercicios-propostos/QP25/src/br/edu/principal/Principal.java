/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//ENUNCIADO: FAÇA UM PROGRAMA QUE RECEBA UMA HORA( UMA VARIÁVEL PARA HORAS E OUTRA PARA MINUTROS), CALCULE E MOSTRE: A) A HORA DIGITADA 
//CONVERTIDA EM MINUTOS; B)O TOTAL DOS MINUTOS; C) O TOTAL DOS MINUTOS CONVERTIDOS EM SEGUNDOS.
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Digite");
		System.out.println("Alguma hora(apenas em horas): ");
		int horas = sc.nextInt();
		System.out.println("Agora os minutos: ");
		int minutos = sc.nextInt();
		
		int h_m = horas*60;
		int total_m = h_m+minutos;
		int segundos = total_m*60;
		
		System.out.println("A hora digitada convertida em minutos é: "+ h_m);
		System.out.println("O total dos minutos é: "+ total_m);
		System.out.println("O total dos minutos convertidos em segundos é: "+ segundos);
		
sc.close();
	}

}
