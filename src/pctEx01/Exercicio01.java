package pctEx01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba= new Scanner(System.in);	
		int num;
		 System.out.println("Digite seu numero");
		 num=receba.nextInt();
		
		if (num >= 20) {
		
			System.out.println("O seu numero e maior");
		}else {
			System.out.println("O seu numero e menor");

		}

 }
}