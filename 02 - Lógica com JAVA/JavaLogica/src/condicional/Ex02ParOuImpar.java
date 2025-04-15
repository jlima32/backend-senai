package condicional;

import java.util.Scanner;

public class Ex02ParOuImpar {

	public static void main(String[] args) {
	/*
	 * 
		2. Faça um programa onde o usuário entre com um número 
		e o programa informe se o número é par ou ímpar.
	 */

		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		
		if (n1 % 2 == 0)
		{
			System.out.println("O número digitado é par");
		}
		else
		{
			System.out.println("O número digitado é ímpar");
		}
		
	}

}
