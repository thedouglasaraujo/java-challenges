import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        double num1 = input.nextDouble();

        System.out.println("Insira o segundo valor:");
        double num2 = input.nextDouble();

        if (num1 == num2) {
            System.out.printf("Multiplicação: %d%n", num1 * num2);
        } else if (num1 > num2) {
            System.out.printf("Subtração: %d%n", num1 - num2);
        } else {
            System.out.printf("Soma: %d%n", num1 + num2);
        }

        input.close();
    }
}
