import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Insira o dado da posição %d:%n", i + 1);
            vetor[i] = input.nextInt();
        }

        System.out.println("Insira a chave de busca:");
        int chave = input.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                System.out.printf("Chave encontrada na posição: %d%n", i + 1);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Chave não encontrada!");
        }

        input.close();
    }
}
