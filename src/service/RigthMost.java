package service;

import java.util.ArrayList;
import java.util.List;

public class RigthMost {
	
	static List<Integer> rightDigit0 = new ArrayList<>();
	static List<Integer> rightDigit1 = new ArrayList<>();
	static List<Integer> rightDigit2 = new ArrayList<>();
	static List<Integer> rightDigit3 = new ArrayList<>();
	static List<Integer> temp		 = new ArrayList<>();
 	
 	static List<List<Integer>> all          = new ArrayList<>();
 	static List<List<Integer>> allRigthMost = new ArrayList<>();
	
 	public static String rightMost()
	{
 		
 		rightDigit0.add(1 );
 		rightDigit0.add(22);
 		rightDigit0.add(93);
 		
 		rightDigit1.add(16 );
 		rightDigit1.add(8  );
 		rightDigit1.add(886);
 		rightDigit1.add(8  );
 		rightDigit1.add(1  );
 		
 		rightDigit2.add(10);
 		rightDigit2.add(0 );
 		
 		rightDigit3.add(876 );
 		rightDigit3.add(129 );
 		rightDigit3.add(2517);
 		rightDigit3.add(5554 );
 		rightDigit3.add(0 );
 		rightDigit3.add(22 );
 		rightDigit3.add(123 );
 		 		
 		all.add(rightDigit0);
 		all.add(rightDigit1);
 		all.add(rightDigit2);
 		all.add(rightDigit3);
 		
		for (List<Integer> arrayNumbers : all) 
		{
			for(Integer number : arrayNumbers )
	 		{
	 			temp.add(number % 10);
	 		}
		
			allRigthMost.add(temp);
			temp = new ArrayList<>();
		}
 		
		for (int i = 0; i < all.size(); i++)
		{
			System.out.print("Array " + i + " -> ");
			System.out.print(all.get(i)+ " -> "   );
			System.out.println(allRigthMost.get(i));
		}
		return "Prontin";
	}
}
