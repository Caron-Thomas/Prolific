package service;

import java.util.Scanner;

public class AreaTriangulo {
	
	String str;
	CalculoJaguara result = new CalculoJaguara();
	Scanner s = new Scanner(System.in);
	
	public String exe( )
	{
			
		System.out.println("Entre com a base do triangulo: ");
		double c = s.nextDouble();
		
		System.out.println("Entre com a altura do seu triangulo: ");
		double h = s.nextDouble();
		
		str = "A área do seu trinagulo é "+ result.execute(c, h);
		
		return str;
	}
}
