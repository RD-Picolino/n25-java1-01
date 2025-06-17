package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome e sobrenome: ");
		String nome = sc.next(); //utiliza o delimitador padrão
		String sobrenome = sc.next();
		System.out.println("Seu nome é " + nome + " " + sobrenome);
		//agora pegando o nome completo
		System.out.println("Digite o seu nome completo: ");
		sc.nextLine();//Captura o enter do comando anterior
		String nomeCompleto = sc.nextLine();//Usa o delimitador \n
		System.out.println("Nome completo: " + nomeCompleto);
		sc.close();
	}

}
