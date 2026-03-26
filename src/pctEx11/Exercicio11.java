package pctEx11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		
		
		System.out.println("Digite o Numero");
		int num1=receba.nextInt();
		
		
		if (num1 < 10) {
		System.out.println("O seu numero e pequeno ");
		}else if (num1 <=50){
			System.out.println("O seu numero e médio");
		}else {
			System.out.println("O seu numero e grande");
		}

 }
}