package condicional;

import java.util.Scanner;

public class Ex02ParOuImpar {

	public static void main(String[] args) {
	/*
	 * 
		2. Fa�a um programa onde o usu�rio entre com um n�mero 
		e o programa informe se o n�mero � par ou �mpar.
	 */

		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		n1 = sc.nextInt();
		
		if (n1 % 2 == 0)
		{
			System.out.println("O n�mero digitado � par");
		}
		else
		{
			System.out.println("O n�mero digitado � �mpar");
		}
		
	}

}
