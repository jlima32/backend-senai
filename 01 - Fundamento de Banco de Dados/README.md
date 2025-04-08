# 🐬 Capítulo 1 - Fundamentos de Banco de Dados 🐬 

1. [Aula 01: Introdução ao Banco de Dados](#aula-01-introdução-ao-banco-de-dados)  
   1.1 [Estrutura de um Banco de Dados](#estrutura-de-um-banco-de-dados)  
   1.2 [MER - Modelo Entidade Relacional](#mer---modelo-entidade-relacional)  
   1.3 [DER Diagrama Entidade Realcional](#der---diagrama-entidade-relacional)  

## Aula 01: Introdução ao Banco de Dados

Um banco de dados é uma coleção de dados inter-relacionados, sempre que for possível agrupar informações que se relacionam e tratam de um mesmo assunto, posso dizer que tenho um banco de dados.

Já um sistema de gerenciamento de banco de dados é um software que possui recursos capazes de manipular as informações do banco de dados e interagir com o usuário.


>**Exemplos de SGBDs:** Oracle, SQL Server, DB2, PostgreSQL, MySQL, entre outros.

### Estrutura de um Banco de Dados

>Base de dados < Tabela < Registro < Coluna (datatype)

>Banco dados < Tabela < Linha < Campo

**Campos:** São a parte fundamental de uma base de dados.

|DADO  |TIPO   |
| ------------ | ------------ |
|Texto   |VARCHAR(n)   |
|Caractere   |CHAR(n)|
|Data |DATE   |
|Data e Hora|DATETIME |
|Inteiro|INT |
|Decimal|DECIMAL   |
|Ponto flutuante|FLOAT   |
|Ponto mais casas|DOUBLE   |
|Booleano| BOOLEAN|

### MER - Modelo Entidade Relacional
Quando desenhamos a estrutura da nossa base de dados chamamos de **MER - Modelo Entidade Relacional**, onde desenhamos o modelo do nosso banco de dados expondo todos os relacionamentos entre as tabelas.

### Exercício

Faça um MER para um hortifruti, com as tabelas: produto, funcionário e cliente.

### DER - Diagrama Entidade Relacional
É uma representação gráfica que mostra como os elementos de um sistema se relacionam entre si.

![Exemplo DER](ExemploDER.png)


