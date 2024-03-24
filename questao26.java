package atvd51;
 
import java.util.Scanner;

public class questao26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        
        int[] votos = new int[3]; 
        
        for (int i = 0; i < totalEleitores; i++) {
            System.out.println("Eleitor " + (i + 1) + ":");
            System.out.println("Digite algum número do candidato sendo, 1, 2 ou 3: ");
            int voto = scanner.nextInt();
        
            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++; 
            } else {
                System.out.println("Voto inválido. Favor, votar novamente.");
                i--; 
            }
        }
        
        System.out.println("Resultado da eleição:");
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos.");
        }
        
        scanner.close();
    }
}
