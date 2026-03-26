package pctEx19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);

		System.out.println("Digite a sua nota");
		int num1=receba.nextInt();
		
		if (num1 > 7 ) {
			System.out.println("Voçê foi aprovado");
			if (num1 >=9) {
				System.out.println("Execelente");
			} 
		}
		else {
			System.out.println("Voçê e reprovado");
		}
	}
}