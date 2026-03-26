package pctEx22;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);

		System.out.println("Qual a nota do final desse ano");
		int num1 = receba.nextInt();
		System.out.println("Qual foi a frequencia durante o ano");
		int num2 = receba.nextInt();
		
		if (num1 >=6 && num2 >= 75) {
			System.out.println("Voçê foi aprovado");
		}else{
			System.out.println("Voçê foi reprovado");
		}

	}
}