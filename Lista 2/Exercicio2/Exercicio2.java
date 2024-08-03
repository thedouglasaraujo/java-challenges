import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Insira o segundo número:");
        double num2 = input.nextDouble();

        System.out.println("Insira o terceiro número:");
        double num3 = input.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }

        input.close();
    }
}
