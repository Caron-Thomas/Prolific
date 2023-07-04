import java.util.Scanner;

import service.AreaTriangulo;
import service.CalculodePi;
import service.TesteDeVelocidade;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner 	  	  s   = new Scanner( System.in );
		AreaTriangulo 	  at  = new AreaTriangulo(     );
		CalculodePi   	  cPi = new CalculodePi(	   ); 
		TesteDeVelocidade tdv = new TesteDeVelocidade(  );
		
		boolean run = true;
		
		System.out.println("Hello World");
		while ( run )
		{
			System.out.println("Escolha: \n1 para Triangulo; \n2 para Pi; \n3 para speedTest de Long e long:" );
			int escolha = s.nextInt( );
			
			switch( escolha ) {
			  case 1:
				  System.out.println( at.exe( ));
			    break;
			  case 2:
				  System.out.println("Escolha quantas interações vc quer. \n(entre 1 e 100.000)." );
				  int interactions = s.nextInt( );
				  System.out.println(cPi.descubraPi( interactions ));
			    break;
			  case 3:
				  System.out.println("Escolha quantas interações vc quer. \n(entre 1 e 100.000.000)." );
				  int interator = s.nextInt( );
				  System.out.printf("O processo 1 demorou %.6f segundos para rodar \n", tdv.slowSum( interator ));
				  System.out.printf("O processo 2 demorou %.6f segundos para rodar \n", tdv.fastSum( interator ));
				break;
			  case 4:
				  
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
