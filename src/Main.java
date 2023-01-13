import java.util.Scanner;
import service.AreaTriangulo;
import service.CalculodePi;

public class Main {
	public static void main(String[] args) {
		
		Scanner 	  s   = new Scanner( System.in );
		AreaTriangulo at  = new AreaTriangulo(     );
		CalculodePi   cPi = new CalculodePi(	   ); 
		
		boolean run = true;
		
		System.out.println("Hello World");
		while ( run )
		{
			System.out.println("Escolha 1 para Triangulo ou 2 para Pi." );
			int escolha = s.nextInt( );
			
			switch( escolha ) {
			  case 1:
				  at.exe( );
			    break;
			  case 2:
				  System.out.println("Escolha quantas inetações vc quer. \n(entre 1 e 100.000)." );
				  int interactions = s.nextInt( );
				  System.out.println(cPi.descubraPi( interactions ));
			    break;
			  default:
				  System.out.println("Eita");
			}
			
			System.out.println("sair? \nDigite S para sim ou N para não." );
			String sair = s.next().toLowerCase();
			run = sair.equals("s") ? false : true;
		}
	}
}
