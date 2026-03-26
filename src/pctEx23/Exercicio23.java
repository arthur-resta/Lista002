package pctEx23;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);

		System.out.println("Digite a sua idade");
		int num1 = receba.nextInt();
		
		if (num1 <=10 || num1 > 60) {
			System.out.println("Voçê pode usar o atendimento prioritario");
		}else{
			System.out.println("Voçê nao pode usar o atendimento prioritario");
		}

	}
}