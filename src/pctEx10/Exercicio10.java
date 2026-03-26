package pctEx10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		int num;
		
		System.out.println("Digite o primeiro numero");
		num=receba.nextInt();
		
		if (num <=70) {
		System.out.println("Voçê foi reprovado ");
		}else {
			System.out.println("Voçê foi aprovado");
		}
	}

}
