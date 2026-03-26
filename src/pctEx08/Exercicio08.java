package pctEx08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		int num;
		
		System.out.println("Digite seu numero");
		num=receba.nextInt();
		
		if (num >0) {
		System.out.println("O seu numero e positivo ");
		}else {
			System.out.println("O seu numero e negativo");
		}
	}

}
