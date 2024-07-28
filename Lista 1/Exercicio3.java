import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o salário:");
        double salario = input.nextDouble();
        
        double novoSalario = salario * 1.25;
        
        System.out.println("Novo salário: " + novoSalario);
        
        input.close();
    }
}