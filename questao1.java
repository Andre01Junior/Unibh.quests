package atvd51;

import java.util.Scanner;
public class questao1 {
	
    public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);
    
    double nota;
    boolean notaV = false; // nota valida
    do {
    
    System.out.println("Escreva uma nota de 0 a 10");
    nota = imput.nextDouble();
    
    if(nota >=0 && nota<= 10) {
    	notaV = true;
    	
    	System.out.println("Nota válida : " +nota);
    	
    }else {
    	//notaV = false;
    	System.out.println("Nota invalida: " +nota+ " , Digite outra nota!");
    	
    }
    	
    	
    }while(!notaV);
    }
}
    
    
