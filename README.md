# Calculadora Intrerativa

## Descrição

Este projeto consiste em uma calculadora desenvolvida na linguagem Java utilizando estruturas de repetição, condicionais e o comando `switch-case`. O programa permite ao usuário realizar operações matemáticas básicas através de um menu interativo.

## Funcionalidades

A calculadora possui as seguintes operações:

* Soma
* Subtração
* Multiplicação
* Divisão
* Potência
* Encerramento do programa

Além disso, as operações de soma e subtração possuem um submenu que permite ao usuário continuar realizando cálculos sobre o resultado obtido sem retornar imediatamente ao menu principal.

## Estrutura do Programa

### Variáveis Utilizadas

| Variável  | Tipo   | Finalidade                                   |
| --------- | ------ | -------------------------------------------- |
| opcao     | int    | Armazena a opção escolhida no menu principal |
| num1      | double | Primeiro número informado pelo usuário       |
| num2      | double | Segundo número informado pelo usuário        |
| resultado | double | Armazena o resultado da operação             |
| novoNum   | double | Número adicional utilizado nos submenus      |
| subOpcao  | int    | Controla as opções dos submenus              |

### Funcionamento

1. O programa exibe um menu com as operações disponíveis.
2. O usuário escolhe uma opção.
3. Os números necessários são solicitados.
4. A operação é realizada e o resultado é exibido.
5. Nos casos de soma e subtração, o usuário pode:

   * Informar novos números para continuar a operação;
   * Retornar ao menu principal.
6. O programa continua executando até que a opção "0 - Sair" seja escolhida.

## Conceitos Aplicados

* Classe e método `main`
* Entrada de dados com `Scanner`
* Estruturas condicionais (`switch-case`)
* Estruturas de repetição (`while`)
* Operações matemáticas
* Utilização da classe `Math` para potência
* Controle de fluxo do programa

## Tecnologias Utilizadas

* Java
* IntelliJ IDEA (ou outra IDE Java)
* JDK (Java Development Kit)

## Autor

Mariana - 202
