import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe quatro números, em sequência:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        
        int soma = num1 + num2 + num3 + num4;
        
        System.out.println("Resultado da soma: " + soma);
        
        input.close();
    }
}
