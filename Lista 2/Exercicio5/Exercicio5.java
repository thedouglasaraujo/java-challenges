import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");

        int opcao = input.nextInt();

        System.out.println("Insira o primeiro valor:");
        int num1 = input.nextInt();

        System.out.println("Insira o segundo valor:");
        int num2 = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("Soma: %d%n", num1 + num2);
                break;
            case 2:
                System.out.printf("Subtração: %d%n", num1 - num2);
                break;
            case 3:
                System.out.printf("Multiplicação: %d%n", num1 * num2);
                break;
            case 4:
                if (num2 != 0) {
                    System.out.printf("Divisão: %d%n", num1 / num2);
                } else {
                    System.out.println("Divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        input.close();
    }
}
