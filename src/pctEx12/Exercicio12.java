package pctEx12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner receba = new Scanner (System.in);
		
		
		System.out.println("Digite o idade");
		int idade=receba.nextInt();
		
		
		if (idade < 13) {
		System.out.println("Voçê ainda e uma criança ");
		}else if (idade <=17){
			System.out.println("Voçê ja e adolescente");
		}else {
			System.out.println("Voçê ja e adulto");
		}

	}
}