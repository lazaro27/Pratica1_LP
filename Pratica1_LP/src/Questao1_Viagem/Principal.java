package Questao1_Viagem;

import java.util.Scanner;

/*Faça um programa que leia o tempo gasto numa viagem (em horas), a velocidade média
e o valor km por litro de um veículo. Calcule o consumo final de combustível gasto.*/

public class Principal {

	public static void main(String[] args) {
		float tmpGasto, velocidadeMedia, kmL, distancia;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o tempo gasto em horas: ");
		tmpGasto = ler.nextFloat();
		
		System.out.print("Digite a velocidade Media: ");
		velocidadeMedia = ler.nextFloat();
		
		System.out.print("Digite o valor do Km por litro: ");
		kmL = ler.nextFloat();
		
		distancia = (velocidadeMedia * tmpGasto);
		
		System.out.print("Consumo final: " + (distancia/kmL));
		
		ler.close();

	}

}
