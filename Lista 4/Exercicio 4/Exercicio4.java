import java.util.Scanner;

public class Exercicio4 {
    public static void dividir100(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] / 100;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vetor = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Insira o dado da posição %d:%n", i + 1);
            vetor[i] = input.nextDouble();
        }

        dividir100(vetor);

        System.out.println("Conteúdo dividido por 100:");
        for (double valor : vetor) {
            System.out.println(valor);
        }

        input.close();
    }
}
