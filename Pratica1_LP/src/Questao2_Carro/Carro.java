package Questao2_Carro;

import java.util.Scanner;

/*Faça um programa que leia a placa de um carro e o ano de fabricação. Em seguida,
validar a situação do carro:
Se o ano for menor que 2010 imprimir: Carro Velho
Se o ano estiver entre 2011 e 2021 imprimir: Carro Semi novo
Se o ano for igual a 2022 imprimir: Carro Novo
O programa deverá substituir as vogais (a, e, i o e u maiúscula e minúscula) da placa
pelo caractere *, e posteriormente imprimir a placa.*/

public class Carro {

	public static void main(String[] args) {
		String placa;
		int ano;

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a placa do carro: ");
		placa = ler.next();

		System.out.print("Digite o ano do carro: ");
		ano = ler.nextInt();

		if (ano <= 2010) {
			System.out.print("CARRO VELHO!");
		} else if (ano < 2021) {
			System.out.print("CARRO SEMI NOVO!");
		} else if (ano == 2022) {
			System.out.print("CARRO NOVO!");
		} else
			System.out.print("ANO INVÁLIDO!");

		placa = placa.toUpperCase();

		placa = placa.replace("A", "*");
		placa = placa.replace("E", "*");
		placa = placa.replace("I", "*");
		placa = placa.replace("O", "*");
		placa = placa.replace("U", "*");

		System.out.print("Placa: " + placa);

		ler.close();

	}

}
