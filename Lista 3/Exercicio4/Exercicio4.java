import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int A = input.nextInt();

        System.out.println("Insira o valor de B:");
        int B = input.nextInt();

        for (int i = A; i <= B; i++) {
            if (i % 2 != 0) {
                System.out.printf("É ímpar: %d%n", i);
            }
        }

        input.close();
    }
}
