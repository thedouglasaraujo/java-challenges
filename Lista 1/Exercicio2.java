import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe três notas, em sequência:");
        float nota1 = input.nextFloat();
        float nota2 = input.nextFloat();
        float nota3 = input.nextFloat();
        
        float media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Média aritmética: " + media);
        
        input.close();
    }
}