package br.com.senaisp.bauru.aula05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Usando o Scanner para ler um arquivo de texto
		Scanner sc = new Scanner(Exercicio01.class.getResourceAsStream("arquivo.txt"));
		String linha = sc.nextLine();//pegando o cabeçalho
		Scanner sca = new Scanner(linha);
		sca.useDelimiter(";");
		//imprimindo o cabeçalho
		while(sca.hasNext()) {
			System.out.print(sca.next()+ "\t\t"); //t = tab
		}
		System.out.println();//pulando a linha
		sca.close();
		while(sc.hasNextLine()) {
			linha = sc.nextLine();
			sca = new Scanner(linha).useLocale(Locale.US);
			sca.useDelimiter(";");
			//Imprimindo o nome
			System.out.print(sca.next());//nome
			//Imprimindo a idade
			System.out.print(sca.nextInt() + "\t");//idade
			System.out.println(sca.nextDouble());//salario
			//fechando o Scanner
			sca.close();
		}
	}

}
