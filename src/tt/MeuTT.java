package tt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeuTT {

	public static void main(String[] args) {
		
		
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite o vlaor inteiro: ");
//		interactions = teclado.nextInt();
		
		//printBuzzInt(interactions);
		
//		int[] notes = {1, 2, 3, 2, 2, 1, 5, 5};
//		getRareNotes(notes);
//		int[] notes2 = {7, 2, 3, 2, 2, 1, 4, 3, 6, 5, 5, 7, 1, 4, 6};
//		getRareNotes(notes2);
		
//		int   hodorStrength = 50;
//		int[] doorsStrength = {10,25,5};
//		int[] zombiesInflux = {2,3,1};
//		
//		System.out.print( holdTheDoor(hodorStrength, doorsStrength, zombiesInflux ));
		
		System.out.print( areAnagrams("Alsegria","   regaliaS" ) );
		
		
	}
	
		private static boolean areAnagrams(String word1, String word2) {
			
			char[] word1Treated = word1.replaceAll("\\s+", "").toLowerCase().toCharArray();
			char[] word2Treated = word2.replaceAll("\\s+", "").toLowerCase().toCharArray();
			
			Arrays.sort(word1Treated);
			Arrays.sort(word2Treated);
			
			return Arrays.compare(word1Treated, word2Treated) == 0 ? true : false;
		}
	
	
		private static int holdTheDoor(int hodorStrength, int[] doorsStrength, int[] zombiesInflux) {
			
			int[] holdTheDoor	   = new int[zombiesInflux.length];
			int   longestHodorHold =  0; 
			int   index 		   = -1;
			
			for (int i = 0; i < zombiesInflux.length; i++) {
				
				holdTheDoor[i] = ( hodorStrength + doorsStrength[i] ) / zombiesInflux[i]; 
					
				System.out.println(holdTheDoor[i]);
			}
			
			longestHodorHold = Arrays.stream(holdTheDoor).max().getAsInt();
			
			for (int i = 0; i < zombiesInflux.length; i++) {
			    
				if ( holdTheDoor[i] == longestHodorHold) {
			        index = i;
			        break;
			    }
			}
			
			return index;
		}
				
		
		private static  int[] getRareNotes(int[] notes) {
			
			int   itens    = 0;
			int   position = 0;
			int[] rareNotes 		   = new int[notes.length];
			List<Integer> list   	   = new ArrayList<>();
			
			for (int i : notes) {
				list.add(i);
			}
						
			for (Integer i : list) {
				itens = (int) list.stream()
						    .filter(e -> e == i)
						    .count();
				
				if(itens == 1) {
					rareNotes[position] = i;
				System.out.print(rareNotes[position]);
				}
			}
			return rareNotes;
		}
	
		private static void printBuzzInt(int interactions) {
			
			String value;
			
			for (int i = 1; i < interactions; i++) {
				
				value = i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" 
												 : i % 3 == 0 ? "Fizz" 
												 : i % 5 == 0 ? "Buzz" 
												 : String.valueOf(i);
			
				System.out.println(value);
			}
		}
}