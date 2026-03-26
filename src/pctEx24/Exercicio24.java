package pctEx24;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);

		System.out.println("Digite um numero");
		int num1 = receba.nextInt();
		
		if (num1 ==10 || num1 == 20) {
			System.out.println("E especial");
		}else{
			System.out.println("Não e especial");
		}
	}
}