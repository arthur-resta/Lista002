package pctEx15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		
		
		System.out.println("Digite a temperatura");
		int num1=receba.nextInt();
		
		
		if (num1 < 15) {
		System.out.println("Esta frio ");
		}else if (num1 <=25){
			System.out.println("Esta agradavel");
		}else {
			System.out.println("Esta quente");
		}
	}
}	