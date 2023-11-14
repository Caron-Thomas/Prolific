package exercises;

public class LargestOdd {
    public static void main(String[] arg) {
        String t = largestOddNumber("340876075346024756208735655392");
        System.out.println(t);
        System.out.println("=====================");
        String t1 = largestOddNumber("52");
        System.out.println(t1);
        System.out.println("=====================");
        String t2 = largestOddNumber("4206");
        System.out.println(t2);
        System.out.println("=====================");
        String t3 = largestOddNumber("35427");
        System.out.println(t3);
        System.out.println("=====================");
        String t4 = largestOddNumber("0659653");
        System.out.println(t4);
        System.out.println("=====================");
        String t5 = largestOddNumber("47354");
        System.out.println(t5);
    }
    static String largestOddNumber(String num) {
        char[] c = num.toCharArray();

        if(c[c.length-1] % 2 != 0)
            return new String(c);

        for(int i = c.length - 1;  i >= 0 ; i--) {
            int odd = Character.getNumericValue(c[i]);
            if(odd % 2 == 1) {
                char[] d = new char[i + 1];
                for(int j = i;  j >= 0 ; j--){
                    d[j] = c[j];
                }
                return new String(d);
            }
        }
        return "";
    }


}
