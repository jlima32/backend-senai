package condicional;

import java.util.Scanner;

public class Ex04Notas {

	public static void main(String[] args) {
		/* 
		 * 2. Faça um programa onde o usuário entre com 4 notas, e o programa calcule a média 
		 * e informe se o aluno foi aprovado, reprovado ou ficou de exame. 
		 * Lembrando que para a aprovação é necessário uma nota superior a 7,
		 * e uma nota inferior a 5 já reprova o aluno.
		 * */
		
		double n1,n2,n3,n4;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		n3 = sc.nextDouble();
		System.out.print("Digite a quarta nota: ");
		n4 = sc.nextDouble();
		
		double media = (n1 + n2 + n3 + n4) / 4;
		System.out.println(media);
		
		if (media > 7)
		{
			System.out.println("O aluno foi Aprovado!!");
		}
		else if(media < 5)
		{
			System.out.println("O aluno foi Reprovado!!!");
		}
		else
		{
			System.out.println("o aluno ficou de exame!!!!");
		}
		System.out.println("Fim do Programa!!!!");
		
	}

}
