package atvd51;

import java.util.Scanner;

public class questao50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");

        int N = scanner.nextInt();
        double H = calcularH(N);
        
        System.out.println("O valor de H com " + N + " termos é: " + H);
        scanner.close();
    }
    public static double calcularH(int N) {

        double soma = 0;

        for (int i = 1; i <= N; i++) {
            soma += 1.0 / i;
        }
        return soma;
    }
}
