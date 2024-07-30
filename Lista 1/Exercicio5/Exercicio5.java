import java.util.Scanner;
import static java.lang.Math.pow;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número:");
        double num1 = input.nextDouble();

        while (num1 <= 0) {
            System.out.println("Insira um número maior que zero:");
            num1 = input.nextDouble();
        }

        System.out.println("Insira o segundo número:");
        double num2 = input.nextDouble();

        while (num2 <= 0) {
            System.out.println("Insira um número maior que zero:");
            num2 = input.nextDouble();
        }
        
        double resultado = pow(num1, num2);
        
        System.out.printf("Resultado: %.2f%n", resultado);
        
        input.close();
    }
}