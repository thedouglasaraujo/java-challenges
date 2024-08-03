import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Insira o segundo número:");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior é: " + num1);
        } else if (num1 < num2) {
            System.out.println("O maior é: " + num2);
        } else {
            System.out.println("Os números são iguais");
        }

        input.close();
    }
}
