package pctEx13;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner (System.in);
		
		
		System.out.println("Digit a sua nota");
		int nota=receba.nextInt();
		
		
		if (nota < 5) {
		System.out.println("Voçê foi reprovado ");
		}else if (nota<=7){
			System.out.println("Voçê esta recuperaçao");
		}else {
			System.out.println("Voçê foi aprovado");	
		}

	}
}