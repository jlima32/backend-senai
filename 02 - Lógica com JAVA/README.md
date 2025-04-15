#  Capítulo 2 - Lógica com JAVA 

1. [Aula 01: Variáveis](#aula-01-introdução-ao-banco-de-dados)  
   1.1 [Tipos de variáveis](#) 
2. [Aula 02: ](#)  
   2.1 [Criando o banco de dados](#criando-o-banco-de-dados)  
2. [Aula 03: Desvios Condicionais](#aula-03-desvios-condicionais)  
   3.1 [if](#if)  
   
   
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

### else


### if aninhado


### switch


### break

