package pctEx07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		int num;
		
		System.out.println("Digite seu numero");
		num=receba.nextInt();
		
		if (num % 2 == 0) {
		System.out.println("O seu numero e par ");
		}else {
			System.out.println("O seu numero e impar");
		}
	}

}
