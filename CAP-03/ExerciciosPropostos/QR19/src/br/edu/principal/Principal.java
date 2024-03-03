package br.edu.principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) {
		
//ENUNCIADO:CADA DEGRAU DE UMA ESCADA TEM X DE ALTURA. FAÇA UM PROGRAMA QUE RECEBA ESSA ALTURA E A ALTURA QUE O USUÁRIO DESEJA ALCANÇAR 
//SUBINDO A ESCADA, CALCULE E MOSTRE QUANTOS DEGRAUS ELE DEVERA SUBIR PARA ATINGIR SEU OBJETIVO, SEM SE PREOCUPAR COM A ALUTRA DO USUÁRIO.
//TODAS AS MEDIDAS FORNECIDAS DEVEM ESTAR EM METROS.

		String resposta = "";
		String resposta2 = "";
		
		System.out.println("Digite a altura do degrau(a unidade de medida é metro):");
		
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		
	    try {
			resposta = bf.readLine();
		}   
		    catch (IOException e) {
		    	e.printStackTrace();
		    	}
		float altura_degrau = Float.valueOf(resposta);
		
		System.out.println("Digite a altura que deseja alcançar subindo a escada: ");
		try {
			resposta2 = bf.readLine();
		}   
		    catch (IOException e) {
		    	e.printStackTrace();
		    	}
		float altura_desejada = Float.valueOf(resposta2);
		
		int resultado = Math.round(altura_desejada/altura_degrau);
		
		System.out.println("Você precisará subir "+resultado+" degraus para alcançar a altura desejada");
	}
}