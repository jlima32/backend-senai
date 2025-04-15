package condicional;

import java.util.Scanner;

public class Ex01NumerosDiferentes {

	public static void main(String[] args) {
	/*
	 * 
	1. Faça um programa onde o usuário entre com dois números e o 
	programa informe se os números são iguais ou diferentes.
	 * */

		float n1, n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Primeiro Número: ");
		n1 = sc.nextFloat();
		System.out.println("Digite o Segundo Número: ");
		n2 = sc.nextFloat();
		
		if (n1 == n2)
		{
			System.out.println("Os números são iguais");
		}
		else
		{
			System.out.println("Os números são diferentes");
		}
		
		
	}

}
