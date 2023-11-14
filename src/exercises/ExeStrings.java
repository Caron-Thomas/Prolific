package exercises;

import java.util.*;
import java.util.stream.Collectors;

public class ExeStrings {

    private static final String s = "Josef Marlon";
    private static final String s1 = "vFreTraLoOpot";
    private static final String s2 = "thOmasCarondEcAstRoDeus";
    private static final String s3 = "BruninBrunao";
    private static final String s4 = "aaaeeeiiiooouuu";
    private static final String s5 = "AaEeIiOoUu";
    private static final String s6 = "abcdefghij";
    private static final String s7 = "i";
    private static final String s8 = "iI";
    private static final String s9 = "aeiOu";
    private static final String s10 = "AsesIsosU";
    private static final Map<Character, Integer> asc = new HashMap<>();


    public static void main(String[] args) {

        String t = sortVowels(s);
        System.out.println(t);
        System.out.println("=======================");
        String t1 = sortVowels(s1);
        System.out.println(t1);
        System.out.println("=======================");
        String t2 = sortVowels(s2);
        System.out.println(t2);
        System.out.println("=======================");
        String t3 = sortVowels(s3);
        System.out.println(t3);
        System.out.println("=======================");
        String t4 = sortVowels(s4);
        System.out.println(t4);
        System.out.println("=======================");
        String t5 = sortVowels(s5);
        System.out.println(t5);
        System.out.println("=======================");
        String t6 = sortVowels(s6);
        System.out.println(t6);
        System.out.println("=======================");
        String t7 = sortVowels(s7);
        System.out.println(t7);
        System.out.println("=======================");
        String t8 = sortVowels(s8);
        System.out.println(t8);
        System.out.println("=======================");
        String t9 = sortVowels(s9);
        System.out.println(t9);
        System.out.println("=======================");
        String t10 = sortVowels(s10);
        System.out.println(t10);
    }
    public static String sortVowels(String s) {

        Map<Integer, Integer> temp = new HashMap<>();
        asc.put('A', 65 );
        asc.put('a', 97 );
        asc.put('E', 69 );
        asc.put('e', 101);
        asc.put('I', 73 );
        asc.put('i', 105);
        asc.put('O', 79 );
        asc.put('o', 111);
        asc.put('U', 85 );
        asc.put('u', 117);

        for(int i = 0; i < s.length(); i++) {
            if(asc.get(s.charAt(i)) != null) {
                temp.put(i, s.codePointAt(i));
                System.out.print(s.charAt(i) + " ");
                System.out.println(s.codePointAt(i));
            }
        }

        if(temp.size() <= 1)
            return s;

        char[]  sTemp = s.toCharArray();
        int[][] iTemp = new int[temp.size()][2];

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(temp.entrySet());
        Collections.sort(entryList, Map.Entry.comparingByKey());
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : entryList){
            iTemp[count][0] = entry.getKey();
            count++;
        }

        Collections.sort(entryList, Map.Entry.comparingByValue());
        count = 0;
        for (Map.Entry<Integer, Integer> entry : entryList){
            iTemp[count][1] = entry.getValue();
            count++;
        }

        System.out.println("----------------------");

        for(int i = 0; i < iTemp.length; i++ ){
            sTemp[iTemp[i][0]] = (char)iTemp[i][1];
            System.out.print(iTemp[i][0] + " ");
            System.out.println(iTemp[i][1]);
        }
        return new String(sTemp);
    }
}
