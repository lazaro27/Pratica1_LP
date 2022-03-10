package Questao4_OperadoraAerea;

import java.util.Random;
import java.util.Scanner;

public class OperadoraAerea {

	public static void main(String[] args) {
		int op;
		String nome, cpf, data, hora;
		int nVoo;
		Random gerador = new Random();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("OPERADORA AÉREA");
		System.out.println("Digite uma das opções abaixo: ");
		System.out.println("1-Cadastrar Passageiro;\n2-Check in; \n3-Cancelar Voo; \n4-Sair;\n");
		System.out.print(">>>_");
		
		op = ler.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("Digite o Nome do passageiro: ");
				nome = ler.next();
				System.out.println("Digite o CPF do passageiro: ");
				cpf = ler.next();
				System.out.println("Digite a Data do Voo: ");
				data = ler.next();
				System.out.println("Digite a hora do Voo: ");
				hora = ler.next();
				System.out.println("Número do Voo: " + gerador.nextInt(1000));
				break;
			
			case 2:
				System.out.println("Digite o CPF do passageiro: ");
				cpf = ler.next();
				System.out.println("Digite o N° do voo: ");
				nVoo = ler.nextInt();
				
				System.out.println("CHECK IN REALIZADO COM SUCESSO! ");
				
			case 3:
				System.out.println("Digite o CPF do passageiro: ");
				cpf = ler.next();
				System.out.println("Digite o N° do voo: ");
				nVoo = ler.nextInt();
				
				System.out.println("VOO CANCELADO COM SUCESSO! ");
								
				break;
				
			default:
				System.out.println("OPÇÃO INVÁLIDA!");
				
				
		 
		}
		

	}

}
