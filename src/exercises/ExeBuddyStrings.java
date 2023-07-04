package exercises;

import java.util.Arrays;

public class ExeBuddyStrings {

	public static void main(String[] args) {
		
		String  s1 = "ab",
				s2 = "ba",
				
				s3 = "ab", //false
				s4 = "ab",
				
				s5 = "abcd",
				s6 = "acbd",
				
				s7 = "aaaaaabc",
				s8 = "aaaaaacb",
				
				s9 = "abcdefghi",
				s10 = "abhdefgci",
				
				s11 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc",
				s12 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacb",
				
				s13 = "aabbccddee",
				s14 = "aebbccddea";
		
		
		
		
		System.out.print(
				buddyStrings(s1 , s2 ) + "\n" +
				buddyStrings(s3 , s4 ) + "\n" +
				buddyStrings(s5 , s6 ) + "\n" +
				buddyStrings(s7 , s8 ) + "\n" +
				buddyStrings(s9 , s10) + "\n" +
				buddyStrings(s11, s12) + "\n" +
				buddyStrings(s13, s14)
		);
	}
		
    public static boolean buddyStrings(String s, String goal) {

         if(s.length() != goal.length())
            return false;
       
        char[] sChar =    s.toCharArray();
        char[] gChar = goal.toCharArray();
        char   temp  = 't';

        for(int i = 0 ; i < s.length(); i++){
           
            for(int j = i+1 ; j < s.length(); j++){
               
                temp     = sChar[i];
                sChar[i] = sChar[j];
                sChar[j] = temp;

                if(Arrays.equals(sChar , gChar) ){
                    return true;
                }

                sChar =    s.toCharArray();
                gChar = goal.toCharArray();
            }
        }	

        return false;

    	}
	}

