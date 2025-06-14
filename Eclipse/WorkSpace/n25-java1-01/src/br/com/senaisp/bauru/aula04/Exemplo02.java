package br.com.senaisp.bauru.aula04;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str01 = "Roberto da Silva Sauro";
		//Verificar se há dino no texto
		System.out.println(str01.contains("dino"));
		//Obter a posição de um texto no subtexto
		System.out.println(str01.indexOf("Silva"));
		//Obter o caractere na posição desejada
		System.out.println(str01.charAt(3));
		//Obtendo substring de uma String sem limitar o final
		System.out.println(str01.substring(8));
		//Obtendo substring de uma String limitando o final
		System.out.println(str01.substring(8,16));
		//Usando o compareTo
		System.out.println(str01.compareTo("Roberta"));
	}

}
