#  Capítulo 2 - Lógica com JAVA 

1. [Aula 01: Variáveis](#)  
   1.1 [Tipos de variáveis](#) 
   1.2 [Nome de variáveis](#) 
2. [Aula 02: ](#)  
   2.1 [](#)  
3. [Aula 03: Desvios Condicionais](#aula-03-desvios-condicionais)  
   3.1 [if](#if)    
   3.2 [else](#else)    
   3.3 [Exercícios](#exercícios)    
   3.4 [if Aninhado](#if-aninhado)    
   
## Aula 01: 

## Aula 02: 

## Aula 03: Desvios Condicionais
São comandos utilizados em uma linguagem de programação para determinar qual a ordem e quais comandos devem ser executados pelo programa em uma dada condição.

### if
Utilizamos o if quando desejamos que o programa teste uma ou mais condições e execute um ou outro comando de acordo com o resultado deste teste.

```java
// A sintaxe de if é a seguinte:

if (condicao)
   comando;

if (condicao)
{
   comando1;
   comando2;
}
```
:floppy_disk: condicional/Exemplo01.java
```java
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

```
:computer: **Resultado:**
```
Digite um número: 10
O número é maior que 5!
Fim do programa!
```

###  else
O comando else define um bloco de código que é executado quando a condição if não é atendida. 

:floppy_disk: condicional/Exemplo01.java
```java
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
		else
		{
			System.out.println("O número não é maior que 5!");
		}
		System.out.println("Fim do programa!");
	}

}
```
:computer: **Resultado:**
```
Digite um número: 5
O número não é maior que 5!
Fim do programa!
```

### Exercícios

1. Faça um programa onde o usuário entre com dois números e o programa informe se os números são iguais ou diferentes.

:floppy_disk: condicional/Ex01NumerosDiferentes.java
```java
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
```

:computer: **Resultado:**
```
Digite o Primeiro Número: 
1,5
Digite o Segundo Número: 
1,5
Os números são iguais
```

2. Faça um programa onde o usuário entre com um número e o programa informe se o número é par ou ímpar.


:floppy_disk: condicional/Ex02ParOuImpar.java
```java
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
```

:computer: **Resultado:**
```
Digite um número: 
3
O número digitado é ímpar
```

### if Aninhado
Complementando a estrutura if/else, temos o operador else if. Ele permite incluir condições adicionais na lógica de decisão, possibilitando um controle mais preciso sobre os diferentes caminhos que o programa pode seguir.


:floppy_disk: condicional/Exemplo01.java
```java
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
		else if(n < 5)
		{
			System.out.println("O número é menor que 5!");
		}
		else
		{
			System.out.println("O número é igual a 5");
		}
		System.out.println("Fim do programa!");
	}

}
```
:computer: **Resultado:**
```
Digite um número: 5
O número é igual a 5
Fim do programa!
```

### Exercícios

### switch


### break

