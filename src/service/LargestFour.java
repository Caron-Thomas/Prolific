package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestFour {
	
	public static int largestFour( int size ) 
	{
		ArrayList<Integer> array = new ArrayList<>();
		Scanner s    = new Scanner(System.in);
		int     soma = 0;
		int		cont = 0;
		
		for (int i = 0; i < size; i++) 
		{
			System.out.println("Entre com o próximo valor inteiro:");
			array.add(s.nextInt());
		}
		
		Collections.sort(array, Collections.reverseOrder());
		
		for ( Integer j : array ) 
		{
			soma += j;
			cont++;
						
			if( cont > 3)
				break;
		}
		return soma;
	}
}
