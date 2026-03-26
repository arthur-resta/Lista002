package pctEx25;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);

		System.out.println("Digite um numero");
		int num1 = receba.nextInt();
		
		if (!(num1 == 0)) {
			System.out.println("Número diferente de zero");
		}else{
			System.out.println("Número igual a zero");
		}
	}
}