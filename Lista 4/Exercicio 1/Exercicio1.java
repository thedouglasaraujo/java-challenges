import java.util.Scanner;

public class Exercicio1 {
    public static void maior(int num1, int num2) {
        if (num1 > num2) {
            System.out.printf("O maior é: %d%n", num1);
        } else if (num1 < num2) {
            System.out.printf("O maior é: %d%n", num2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int num1 = input.nextInt();

        while (num1 <= 0){
            System.out.println("Insira um número maior que zero:");
            num1 = input.nextInt();
        }

        System.out.println("Insira o segundo número:");
        int num2 = input.nextInt();

        while (num2 <= 0){
            System.out.println("Insira um número maior que zero:");
            num2 = input.nextInt();
        }

        maior(num1, num2);

        input.close();
    }
}
