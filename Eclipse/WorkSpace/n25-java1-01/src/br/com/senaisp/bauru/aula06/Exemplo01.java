package br.com.senaisp.bauru.aula06;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Definindo um vetor de flores
		String [] flores = new String[4];
		//Utilizando o vetor e atribuindo o conteúdo
		flores[0] = "Rosa";
		flores[1] = "Cravo";
		flores[2] = "Lírio";
		flores[3] = "Margarida";
		//Mostrando os valores com for
		for(int i=0;i<flores.length;i++) {
			System.out.println(flores[i]);
		}
		System.out.println("-".repeat(20));
		//utilizando o fot em conjunto (foreach)
		for(String it: flores) {
			System.out.println(it);
		}
	}

}
