import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n CALCULADORA INTERATIVA ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            double numero1, numero2, resultado, novoNumero;
            int subOpcao;

            switch (opcao) {

                //Somar os números//
                case 1:
                    numero1 = lerNumero(sc, "Digite o primeiro número: ");
                    numero2 = lerNumero(sc, "Digite o segundo número: ");

                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);

                    do {
                        System.out.println("\n1 - Somar mais um número");
                        System.out.println("2 - Voltar ao menu");
                        subOpcao = sc.nextInt();

                        if (subOpcao == 1) {
                            novoNumero = lerNumero(sc, "Informe mais um número: ");
                            resultado += novoNumero;
                            System.out.println("Resultado: " + resultado);
                        }

                    } while (subOpcao == 1);

                    break;

                //Subtrair os números//
                case 2:
                    numero1 = lerNumero(sc, "Digite o primeiro número: ");
                    numero2 = lerNumero(sc, "Digite o segundo número: ");

                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);

                    do {
                        System.out.println("\n1 - Subtrair mais um número");
                        System.out.println("2 - Voltar ao menu");
                        subOpcao = sc.nextInt();

                        if (subOpcao == 1) {
                            novoNumero = lerNumero(sc, "Informe mais um número: ");
                            resultado -= novoNumero;
                            System.out.println("Resultado: " + resultado);
                        }

                    } while (subOpcao == 1);

                    break;

                //Multiplicar os números//
                case 3:
                    numero1 = lerNumero(sc, "Digite o primeiro número: ");
                    numero2 = lerNumero(sc, "Digite o segundo número: ");

                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

                //Dividir os números//
                case 4:
                    numero1 = lerNumero(sc, "Digite o primeiro número: ");
                    numero2 = lerNumero(sc, "Digite o segundo número: ");

                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Não é possível dividir por zero!");
                    }
                    break;

                //Elevar número à potência//
                case 5:
                    numero1 = lerNumero(sc, "Base: ");
                    System.out.print("Expoente: ");
                    int expoente = sc.nextInt();

                    resultado = Math.pow(numero1, expoente);
                    System.out.println("Resultado: " + resultado);
                    break;

                //Sair da calculadora//
                case 0:
                    System.out.println("Obrigado por usar a calculadora!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    public static double lerNumero(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }
}