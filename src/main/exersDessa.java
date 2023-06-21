package main;

import java.util.Scanner;

public class exersDessa {
	
	public static void main ( String[] args )
	{
		boolean run = true;
		System.out.println( "Start." );
		while ( run )
		{
			System.out.println("Digite a palavra escolhida: ");
			Scanner s   = new Scanner( System.in );
			System.out.println( palidromicSubstring( s.nextLine()));
			System.out.println("End? -> y para terminar");
			run = s.next().equals("y") ? false : true;
		}
		System.out.println("End."); 
	}
	
	public static String palidromicSubstring( String str )
	{
		
		String subString = "", biggestSubstring = "";
		str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i; j < str.length(); j++) 
			{
				subString = str.substring(i, j+ 1);
				
				if( isPalindromic(subString))
					biggestSubstring = biggestSubstring.length() > subString.length()
									 ? biggestSubstring
									 : subString;
			}
		}
				
		return biggestSubstring = biggestSubstring.length() < 2 ? "None" : biggestSubstring;
	}

	public static boolean isPalindromic( String subString)
	{
		int i = 0, j = subString.length() - 1;
	
		while( i < j )
		{
			if( subString.charAt(i) != subString.charAt(j) )
				return false;
		
			i++;
			j--;
		}

		return true;
	}
}
