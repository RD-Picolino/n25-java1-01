package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//O delimitador padão do scanner é o espaço em branco
		System.out.println("Digite 3 números espaçando-os: ");
		int nr1 =sc.nextInt();
		int nr2 = sc.nextInt();
		int nr3 = sc.nextInt();
		System.out.println("Os valores digitados foram: ");
		System.out.println(nr1 + " - " + nr2 + " - " + nr3);
		sc.close();
	}

}
