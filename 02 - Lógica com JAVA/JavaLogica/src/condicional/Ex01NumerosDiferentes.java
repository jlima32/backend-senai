package condicional;

import java.util.Scanner;

public class Ex01NumerosDiferentes {

	public static void main(String[] args) {
	/*
	 * 
	1. Fa�a um programa onde o usu�rio entre com dois n�meros e o 
	programa informe se os n�meros s�o iguais ou diferentes.
	 * */

		float n1, n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Primeiro N�mero: ");
		n1 = sc.nextFloat();
		System.out.println("Digite o Segundo N�mero: ");
		n2 = sc.nextFloat();
		
		if (n1 == n2)
		{
			System.out.println("Os n�meros s�o iguais");
		}
		else
		{
			System.out.println("Os n�meros s�o diferentes");
		}
		
		
	}

}
