package Questao3_Frase;

import java.util.Scanner;
/*Faça um programa que leia uma frase, calcule e mostre o número de vogais existentes,
sem repetição.*/

public class Frase {

	public static void main(String[] args) {
		String frase;
		int cont = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		frase = ler.nextLine();
		frase = frase.toUpperCase();
		
		
		if(frase.contains("A")) {
			cont++;	
		}
		
		if(frase.contains("E")) {
			cont++;	
		}
		if(frase.contains("I")) {
			cont++;	
		}
		if(frase.contains("O")) {
			cont++;	
		}
		if(frase.contains("U")) {
			cont++;	
		}
		
		
		System.out.println("O numero de vogais existentes e: " + cont);
		//System.out.println("Frase: " + frase);
		System.out.println("testandooo ");
		ler.close();
	}

}
