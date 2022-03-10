package Questao3_Frase;

import java.util.Scanner;

/*Faça um programa que leia uma frase, calcule e mostre o número de vogais existentes,
sem repetição.*/

public class Frase {

	public static void main(String[] args) {
		String frase;
		char c;
		int cont = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		frase = ler.nextLine();
		frase = frase.toUpperCase();
		
		for(int i = 0; i < frase.length(); i++) {
			c = frase.charAt(i);
			if(c=='A' || c=='E' || c=='I' || c == 'O' || c=='U') {
				cont++;
			}
			
		}
		
		System.out.println("O numero de vogais existentes e: " + cont);
		System.out.println("Frase: " + frase);
		ler.close();
	}

}
