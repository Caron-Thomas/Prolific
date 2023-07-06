package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestSubarray {

	public static void main(String[] args) {

		int[] exe1 	= { 1, 1, 1, 1, 1, 0, 1 }; 								 	// 6 - Ok
		int[] exe2 	= { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };	// 12 - Ok 
		int[] exe3 	= { 1, 1, 1, 0, 1, 0, 1 }; 									// 4 - Ok
		int[] exe4 	= { 1, 1, 1, 1, 1, 1, 0 }; 									// 6 - Ok
		int[] exe5 	= { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 };		// 2 - Ok
		int[] exe6 	= { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1 };	// 7 - ok
		int[] exe7 	= { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1 };			// 5 - ok
		int[] exe8 	= { 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1 };	// 5 -
		int[] exe9	= { 1, 1 };							 						// 1 - Ok
		int[] exe10 = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0};		// 2 -  
		int[] exe11 = { 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };	// 4 - 
		int[] exe12	= { 1, 1, 0 };							 					// 2 - Ok
		int[] exe13	= { 1, 1, 1 };							 					// 2 - 2
		int[] exe14	= { 1, 1, 0, 1, 0, 0, 0, 1 };							 	// 3 - 
		int[] exe15	= { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0 };	// 2 - 
		
		System.out.print(
//		longestSubarray( exe1)+ " " +
//		longestSubarray( exe2)+ " " +
//		longestSubarray( exe3)+ " " +
//		longestSubarray( exe4)+ " " +
//		longestSubarray( exe5)+ " " +
//		longestSubarray( exe6)+ " " +
//		longestSubarray( exe7)+ " " +
		longestSubarray( exe8)+ " " +
//		longestSubarray( exe9)+ " " +
		longestSubarray(exe10)+ " " +
		longestSubarray(exe11)+ " " +
//		longestSubarray(exe12)+ " " +
		longestSubarray(exe13)+ " " +
		longestSubarray(exe14)+ " " +
		longestSubarray(exe15)
				);

	}

	public static int longestSubarray(int[] nums) {

		int           index      = 0;
		int			  soma 		 = 0;
		List<Integer> indexArray = new ArrayList<>();
		List<Integer> numsList   = Arrays.stream(nums)
										 .boxed()
										 .collect(Collectors.toList());
		
		for (int i = 0; i < nums.length; i++) {

			if(nums[i] == 0) {
				indexArray.add(i);
				index++;
			}
		
		}
		
		if(indexArray.size() < 2) {
			
			if(indexArray.isEmpty()) 
				numsList.remove(0); 
			
			else {
				int i = indexArray.get(0);
				numsList.remove(i);
			} 
				 
			
			for (int j = 0; j < numsList.size(); j++) {
				soma += numsList.get(j);
			}	
			
			return soma;
		}
		
		int gap         = 0;
		int indexToKill = 0;
		int start		= 0;
		int stop		= 0;
		
		if(indexArray.size() == 2) {	
			 if(indexArray.get(1) > numsList.size() - 1 - indexArray.get(0)) {
				 	gap 		= indexArray.get(1);
				 	indexToKill = indexArray.get(0);
				 	start       = 0;
					stop 		= indexArray.get(1) - 1;
					System.out.println(start);
					System.out.println(stop);
			 } 
			 else {
					gap =  numsList.size() - 1 - indexArray.get(0);
					indexToKill = indexArray.get(1);
					start       = indexArray.get(0);
					stop 		= numsList.size() - 2;
					System.out.println(start);
					System.out.println(stop);
			 }
		}
				
		
		else {
			 for (int i = 2; i < indexArray.size(); i++) {
		
			
				 if(indexArray.get(i) - indexArray.get(i - 2) > gap ) {
					gap         = indexArray.get(i) - indexArray.get(i - 2);
					indexToKill = indexArray.get(i - 1);
					start       = indexArray.get(i - 2);
					stop 		= indexArray.get(i);
					System.out.println(start);
					System.out.println(stop);
				}
			 }
		
			 if(numsList.size() - indexArray.get(index - 2) > gap) {
				gap 		= numsList.size() - indexArray.get(indexArray.size() - 2);
				indexToKill = indexArray.get(indexArray.size() - 1);
				start       = indexArray.get(indexArray.size() - 2);
				stop 		= numsList.size() - 2;
				System.out.println(start);
				System.out.println(stop);
			 }
		}
		
		 numsList.remove(indexToKill);
		 for (int j = start; j <= stop; j++) {
				soma += numsList.get(j);
		 }
		return soma;
	}
}
