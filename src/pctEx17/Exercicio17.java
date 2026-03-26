package pctEx17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);

		System.out.println("Digite o seu numero");
		int num1 = receba.nextInt();
		
		if (num1 >18) {
			System.out.println(" e maior que 18  ");
			if (num1 >60) {
			System.out.println(" tem mais de 60 ");
			}
		} else if (num1 <18) {
				System.out.println("tem menos de 18 ");
		} else if (num1 == 18) {
			System.out.println("Voçe tem 18 ");
		
		}
	} 
}