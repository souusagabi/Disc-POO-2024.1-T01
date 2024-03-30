
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//ENUNCIADO: FAÇA UM PROGRAMA QUE RECEBA A MEDIDA DO ÂNGULO FORMADO POR UMA ESCADA APOIADA NO CHÃO E A DISTÂNCIA EM QUE A ESCADA ESTÁ DA 
//PAREDE, CALCULE E MOSTRE A MEDIDA DA ESCADA PARA QUE SE POSSA ALCANÇAR SUA PONTA.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do ângulo: ");
		double ângulo = sc.nextInt();
		System.out.println("Digite o valor da distância entre o ponto de apoio da escada no chão da parede: ");
		double distância = sc.nextFloat();
		
		double escada = Math.round(1/Math.cos (Math.toRadians(ângulo))*distância);
		
		System.out.println("a medida da escada é igual a: "+ escada);
		
		sc.close();
	}

}
