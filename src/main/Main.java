package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o vlaor inteiro: ");
		int 	v;
		double  v1 = 2.1268;
		String  v2 = "Hello World";
		
		
		v = teclado.nextInt();
		System.out.printf("%s o num escolhido foi %d e os double com %.2f cara", v2, v, v1);
		
	}

}
