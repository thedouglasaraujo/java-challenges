import java.util.Scanner;

public class Exercicio3 {
    public static void parImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.printf("%d é par.%n", numero);
        } else {
            System.out.printf("%d é ímpar.%n", numero);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número:");
        int numero = input.nextInt();

        parImpar(numero);

        input.close();
    }
}
