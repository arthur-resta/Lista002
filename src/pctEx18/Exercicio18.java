package pctEx18;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);

		System.out.println("Digite o primeiro numero");
		int num1=receba.nextInt();
		System.out.println("digite o segundo numero");
		int num2=receba.nextInt();
		
		
		
		if (num1 > num2) {
		System.out.println("O primeiro numero e maior ");
		} else if (num1 < num2) {
			System.out.println("O segundo numero e maior");
		}

	}
}