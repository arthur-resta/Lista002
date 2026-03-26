package pctEx20;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);

		System.out.println("Digite a sua idade");
		int num1 = receba.nextInt();
		
		if (num1 >=18) {
			System.out.println("Voçê e maior de idade ");
			if (num1 >=65) {
			System.out.println("Voçê ja pode ser aposentar");
			}
		} else if (num1 <18) {
				System.out.println("Voçê e menor de idade");
	
		}
	}
}