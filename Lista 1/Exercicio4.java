import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira a base:");
        double base = input.nextDouble();
        
        System.out.println("Insira a altura:");
        double altura = input.nextDouble();
        
        double area = (base * altura) / 2;
        
        System.out.println("Área do triângulo: " + area);
        
        input.close();
    }
}
