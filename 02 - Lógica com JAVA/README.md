#  Capítulo 2 - Lógica com JAVA 

1. [Aula 01: Variáveis](#aula-01-variáveis)  
2. [Aula 02: Operadores](#aula-02-operadores)  
   2.1 [Operadores Aritméticos](#operadores-aritméticos)  
   2.2 [Operadores Relacionais](#operadores-relacionais)  
   2.3 [Operadores Lógicos](#operadores-lógicos)  
   2.4 [Operadores Unários de Incremento e Decremento](#operadores-unários-de-incremento-e-decremento)  
3. [Aula 03: Desvios Condicionais](#aula-03-desvios-condicionais)  
   3.1 [if](#if)    
   3.2 [else](#else)    
   3.3 [Exercícios](#exercícios)    
   3.4 [if Aninhado](#if-aninhado)    
   3.5 [Exercícios](#exercícios-1)    
   
## Aula 01: Variáveis
Em Java, uma variável pode ser comparada a uma caixa. Essa caixa possui um tamanho definido, que corresponde à quantidade de memória alocada para ela — algo que depende do tipo da variável, mas falaremos mais sobre isso adiante. Embora o tamanho da caixa (ou seja, o espaço reservado na memória) não possa ser alterado depois de criado, o conteúdo dentro dela pode ser trocado. Ela pode começar vazia, receber um valor, e mais tarde esse valor pode ser substituído por outro. Em resumo, uma variável é um espaço na memória usado para armazenar dados durante a execução de um programa Java.

```java
// A sintaxe para declarar uma variável em java é a seguinte:

dataType variableName = value;

// dataType: O tipo de dados que a variável conterá (por exemplo, int, double, String).
// variableName: O nome da variável.
// value: (Opcional) O valor inicial atribuído à variável.
```

## Aula 02: Operadores

### Operadores Aritméticos
Os operadores aritméticos em Java são usados para realizar operações matemáticas básicas como adição, subtração, multiplicação, divisão e módulo. Eles funcionam com tipos numéricos como int, float, double etc.
| Operador | Nome           | Exemplo   |
|----------|----------------|-----------|
| `+`      | Adição         | `a + b`   |
| `-`      | Subtração      | `a - b`   |
| `*`      | Multiplicação  | `a * b`   |
| `/`      | Divisão        | `a / b`   |
| `%`      | Módulo         | `a % b`   |

### Operadores Relacionais
Os operadores relacionais em Java são usados para comparar dois valores. O resultado dessas comparações é sempre um valor booleano: true (verdadeiro) ou false (falso). Eles são muito usados em estruturas condicionais como if, while e expressões lógicas.

| Operador | Nome                        | Exemplo       |
|----------|-----------------------------|----------------|
| `==`     | Igual a                     | `a == b`       |
| `!=`     | Diferente de                | `a != b`       |
| `>`      | Maior que                   | `a > b`        |
| `<`      | Menor que                   | `a < b`        |
| `>=`     | Maior ou igual a            | `a >= b`       |
| `<=`     | Menor ou igual a            | `a <= b`       |


### Operadores Lógicos
Os operadores lógicos em Java são usados para combinar expressões booleanas (que retornam true ou false). Eles são muito utilizados em estruturas de decisão, como if, while, e expressões condicionais em geral.

| Operador | Nome            | Exemplo        |
|----------|------------------|----------------|
| `&&`     | E lógico (AND)   | `cond1 && cond2` |
| `||`     | OU lógico (OR)   | `cond1 || cond2` |
| `!`      | NÃO lógico (NOT) | `!cond`         |

### Operadores Unários de Incremento e Decremento
Os operadores unários de incremento (++) e decremento (--) são usados para aumentar ou diminuir o valor de uma variável numérica em 1. Eles podem ser usados antes (prefixo) ou depois (sufixo) da variável, e o momento em que a alteração acontece pode afetar o resultado em expressões mais complexas.

| Operador | Nome                | Posição   | Exemplo     |
|----------|---------------------|-----------|--------------|
| `++`     | Incremento          | Prefixo   | `++a`        |
| `++`     | Incremento          | Sufixo    | `a++`        |
| `--`     | Decremento          | Prefixo   | `--a`        |
| `--`     | Decremento          | Sufixo    | `a--`        |


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

>**1.** Faça um programa onde o usuário entre com dois números e o programa informe se os números são iguais ou diferentes.

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

>**2.** Faça um programa onde o usuário entre com um número e o programa informe se o número é par ou ímpar.


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

>**1.** Elabore um programa onde o usuário informe a altura de duas pessoas e o programa retorne quem é o mais alto ou se são da mesma altura.

:floppy_disk: condicional/Ex03Altura.java
```java
package condicional;

import java.util.Scanner;

public class Ex03Altura {

	public static void main(String[] args) {
		/*
		 * 
			2. Elabore um programa onde o usuário informe a 
			altura de duas pessoas e o programa retorne quem 
			é o mais alto ou se são da mesma altura.
		 */
		
		double altura1, altura2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a altura da primeira pessoa: ");
		altura1 = sc.nextDouble();
		System.out.print("Digite a altura da segunda pessoa: ");
		altura2 = sc.nextDouble();
		
		if (altura1 > altura2)
		{
			System.out.println("A primeira pessoa é mais alta");
		}
		else if(altura2 > altura1)
		{
			System.out.println("A segunda pessoa é mais alta");
		}
		else
		{
			System.out.println("As duas pessoas são da mesma altura");
		}
		System.out.println("Fim do Programa!");
	}

}
```
:computer: **Resultado:**
```
Digite a altura da primeira pessoa: 1,89
Digite a altura da segunda pessoa: 1,77
A primeira pessoa é mais alta
Fim do Programa!
```


>**2.** Faça um programa onde o usuário entre com 4 notas, e o programa calcule a média e informe se o aluno foi aprovado, reprovado ou ficou de exame. Lembrando que para a aprovação é necessário uma nota superior a 7,e uma nota inferior a 5 já reprova o aluno.

:floppy_disk: condicional/Ex04Notas.java
```java
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
```
:computer: **Resultado:**
```
Digite a primeira nota: 7,5
Digite a segunda nota: 6,8
Digite a terceira nota: 7,2
Digite a quarta nota: 8
7.375
O aluno foi Aprovado!!
Fim do Programa!!!!
```


### switch


### break

