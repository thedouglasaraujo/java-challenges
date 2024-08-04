import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int num = -1;

        while (num != 0) {
            System.out.println("Insira um número:");
            num = input.nextInt();
            if (num > 0) {
                count++;
            }
        }

        System.out.printf("Quantidade de positivos: %d%n", count);

        input.close();
    }
}
