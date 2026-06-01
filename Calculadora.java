import java.util.Scanner;

public class Calculadora {

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        double num1, num2, resultado, novoNum;
        int expoente;
        boolean continuar;
        int subOpcao = -1;

        opcao = -1;
        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {

            // Exibir menu
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digete o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Digite o segundo número ");
                    num2 = sc.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);

                    while (true) {
                        System.out.println();
                        System.out.println("Digite 1 para informar mais um número");
                        System.out.println("Digite 2 para voltar ao menu principal");
                        subOpcao = sc.nextInt();
                        if (subOpcao != 1) {
                            break;
                        }
                        System.out.println();
                        System.out.print("Informe mais um número: ");
                        novoNum =
                                sc.nextDouble();
                        resultado += novoNum;
                        System.out.println(resultado);
                    }
                    break;

                case 2:

                    System.out.println("Digete o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Digite o segundo número ");
                    num2 = sc.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);

                    while (true) {
                        System.out.println();
                        System.out.println("Digite 1 para informar mais um número");
                        System.out.println("Digite 2 para voltar ao menu principal");
                        subOpcao = sc.nextInt();
                        if (subOpcao != 1) {
                            break;
                        }
                        System.out.println();
                        System.out.print("Informe mais um número: ");
                        novoNum =
                                sc.nextDouble();
                        resultado -= novoNum;
                        System.out.println(resultado);
                    }
                    break;

                case 3:
                    System.out.println("Digete o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Digite o segundo número ");
                    num2 = sc.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);

                    break;
                case 4:
                    System.out.println("Digete o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);

                    break;
                case 5:
                    System.out.print("Base: ");
                    double base = sc.nextDouble();
                    System.out.print("Expoente (N): ");
                    int exp = sc.nextInt();
                    resultado = Math.pow(base, exp);
                    System.out.println(base + "^" + exp + " = " + resultado);
                    break;

                case 0:
                    System.out.println("Obrigado por jogar nossa (minha) calculadora!!!");
                    break;
                default:
                    System.out.println("Não existe essa opção querido!!");

                    while (opcao != 0);
                    sc.close();
            }
        }
    }

