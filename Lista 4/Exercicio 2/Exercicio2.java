import java.util.Scanner;

public class Exercicio2 {
    public static void isFirstGreater(int[] numeros) {
        if (numeros[0] > numeros[1] && numeros[0] > numeros[2]) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.println("Insira o primeiro número:");
        numeros[0] = input.nextInt();
        System.out.println("Insira o segundo número:");
        numeros[1] = input.nextInt();
        System.out.println("Insira o terceiro número:");
        numeros[2] = input.nextInt();

        isFirstGreater(numeros);

        input.close();
    }
}
