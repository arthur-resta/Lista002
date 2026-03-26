package pctEx16;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);

		System.out.println("Digite o Numero");
		int num1 = receba.nextInt();
		
		if (num1 > 0) {
			System.out.println("O seu numero e positivo");
			if (num1 >50) {
			System.out.println("seu numero e maior que 50");
			}
		} else if (num1 <0) {
				System.out.println("O seu numero e negativo");
		} else if (num1 == 0) {
			System.out.println("O seu numero e zero");
		}
	}
}	