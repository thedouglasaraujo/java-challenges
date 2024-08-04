import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int A = input.nextInt();

        System.out.println("Insira o valor de B:");
        int B = input.nextInt();

        System.out.println("Série numérica:");
        for (int i = A + 1; i < B; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        input.close();
    }
}
