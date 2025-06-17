package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor entre 1 e 5:");
		int vlr = sc.nextInt();
		switch(vlr) {
		case 1: System.out.println("Você ganhou uma caneta!");
		case 2:System.out.println("Você ganhou um lápis!");
		case 3:System.out.println("Você ganhou uma borracha!");
		case 4:System.out.println("Você ganhou um bombom!");
		case 5:System.out.println("Você ganhou uma bala!");
		break;
		case 6:System.out.println("Você leu o que está sendo pedido?");
		default: System.out.println("Opção invláida!");
		}
		sc.close();
	}

}
