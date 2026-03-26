package pctEx09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro numero");
		num1=receba.nextInt();
		System.out.println("Digite o segundo numero");
		num2= receba.nextInt();
		
		if (num1 > num2) {
		System.out.println("O primeiro numero e maior que o segundo numero ");
		}else {
			System.out.println("O seu segundo numero e maior que o primeiro numero");
		}
	}

}
