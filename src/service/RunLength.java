package service;

public class RunLength {
	
	public static String runLength(String str)
	{
		String runLengthString = "", exit = "";
		int    count = 1, cicle = 1, rLS = 0;
		
		runLengthString = str.toLowerCase();
		rLS = runLengthString.length() - 1;
		
		for (int i = 0; i < rLS; i++) 
		{
			if( runLengthString.charAt(i) == runLengthString.charAt( i + 1) )
				++count;
			
				++cicle;
				
				if( count - cicle != 0 )
				{
					exit += String.valueOf(count) + runLengthString.charAt(i);
					count = 1;
					cicle = 1;
				}
		}
		
		exit += String.valueOf(count) + runLengthString.charAt(rLS);
		
		return exit;
	}

}
