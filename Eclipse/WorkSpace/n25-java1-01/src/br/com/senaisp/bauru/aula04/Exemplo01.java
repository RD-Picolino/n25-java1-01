package br.com.senaisp.bauru.aula04;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vlr01 = 10;
		int vlr02 = vlr01;
		System.out.println("Vlr01: " + vlr01);
		System.out.println("Vlr02: " + vlr02);
		//Strings
		String str01 = "Abelha";
		String str02 = str01;
		System.out.println("Str01: " + str01);
		System.out.println("Str02: " + str02);
		//nessa comparação, é feita de endereço de memoria 
		//não de conteudo
		System.out.println(str01==str02);
		//para comparar o conteudo usamlos equals ou compare
		System.out.println(str01.equals(str02));
	}

}
