import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número:");
        int N = input.nextInt();

        boolean isPrimo = true;
        if (N <= 1) {
            isPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }

        if (isPrimo) {
            System.out.printf("%d é primo.%n", N);
        } else {
            System.out.printf("%d não é primo.%n", N);
        }

        input.close();
    }
}
