package main;

import java.util.Scanner;

import service.LargestFour;
import service.PalidromicSubstring;

public class exersDessa {
	
	public static void main ( String[] args )
	{
		boolean run1 = false;
		boolean run2 = true;
		System.out.println( "Start." );
		
		while ( run1 )
		{
			System.out.println("Digite a palavra escolhida: ");
			Scanner s   = new Scanner( System.in );
			System.out.println( PalidromicSubstring.palidromicSubstring( s.nextLine()));
			System.out.println("End? -> y para terminar");
			run1 = s.next().equals("y") ? false : true;
		}
		
		while( run2 )
		{
			System.out.println("Digite o tamanho escolhido para o array: ");
			Scanner s   = new Scanner( System.in );
			System.out.println(LargestFour.largestFour( s.nextInt( )));
			System.out.println("End? -> y para terminar"   );
			run2 = s.next().equals("y") ? false : true;
		}
		
		System.out.println("End."); 
	}
}
	
