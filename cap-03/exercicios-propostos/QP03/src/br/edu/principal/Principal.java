/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//ENUNCIADO: FAÇA UM PROGRAMA QUE RECEBA DOIS NÚMEROS, CALCULE E MOSTRE A DIVISÃO DO PRIMEIRO NÚMERO PELO SEGUNDO, SABE-SE QUE O SEGUNDO 
//NÚMERO NÃO PODE SER ZERO, PORTANTO, NÃO É NECESSÁRIO SE PREOCUPAR COM VALIDAÇÕES.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite");
		System.out.println("Um número: ");
		float n1 = sc.nextFloat();
		System.out.println("Outro número: ");
		float n2 = sc.nextFloat();
		
		System.out.println("A divisão entre o primeiro e o segundo número é: "+ n1/n2);
		
		sc.close();
	}

}
