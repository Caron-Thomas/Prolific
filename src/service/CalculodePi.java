package service;

import java.util.Random;
import  java.lang.Math;

public class CalculodePi {
	
	double inCircle, total, x, y, result, pi;
	Random rand = new Random( );
	
	public double descubraPi( int a )
	{
		
		while( total < a )
		{
			x 	   = rand.nextFloat( );
			y 	   = rand.nextFloat( );
			result = Math.sqrt( Math.pow( x,2 )+Math.pow( y,2 ) );
			
			if( result < 1 )
				++inCircle;
			
			++total;
		}
		
		pi = inCircle/total*4;
		
		return pi;
	}
}
