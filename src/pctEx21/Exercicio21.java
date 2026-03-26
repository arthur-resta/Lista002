package pctEx21;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);

		System.out.println("Digite a sua idade");
		int num1 = receba.nextInt();
		
		if (num1 >=18 && num1 < 70) {
			System.out.println("Voçê pode tirar a carteira de motorista");
		}else{
			System.out.println("Voçê ainda e menor de idade não pode tirar a carteira");
		}
	}
}