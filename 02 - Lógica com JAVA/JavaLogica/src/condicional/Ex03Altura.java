package condicional;

import java.util.Scanner;

public class Ex03Altura {

	public static void main(String[] args) {
		/*
		 * 
			2. Elabore um programa onde o usu�rio informe a 
			altura de duas pessoas e o programa retorne quem 
			� o mais alto ou se s�o da mesma altura.
		 */
		
		double altura1, altura2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a altura da primeira pessoa: ");
		altura1 = sc.nextDouble();
		System.out.print("Digite a altura da segunda pessoa: ");
		altura2 = sc.nextDouble();
		
		if (altura1 > altura2)
		{
			System.out.println("A primeira pessoa � mais alta");
		}
		else if(altura2 > altura1)
		{
			System.out.println("A segunda pessoa � mais alta");
		}
		else
		{
			System.out.println("As duas pessoas s�o da mesma altura");
		}
		System.out.println("Fim do Programa!");
	}

}
