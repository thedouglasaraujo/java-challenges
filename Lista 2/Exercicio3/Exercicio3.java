import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d é par.%n", num);
        } else {
            System.out.printf("%d é ímpar.%n", num);
        }

        input.close();
    }
}
