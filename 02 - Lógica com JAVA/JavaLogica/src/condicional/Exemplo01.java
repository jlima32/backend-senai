package condicional;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		if (n > 5)
		{
			System.out.println("O número é maior que 5!");
		}
		System.out.println("Fim do programa!");
	}

}
