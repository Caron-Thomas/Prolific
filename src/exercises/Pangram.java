package exercises;

public class Pangram {

    public static void main(String[] args) {

        System.out.println(
        checkIfPangram("ksdfhkskhdfsakhfdáskdhasfdkhasfdkl")
        );
    }

    public static boolean checkIfPangram(String sentence) {
        int[][] base = new int[26][26];
        int s = 0;
        for (int i = 0; i < base.length ; i++) {
            base[i][0] = i + 97;
        }

        for (int i = 0; i < sentence.length(); i++) {
            if(s == 26)
                break;
            s = 0;
            for (int j = 0; j < base.length; j++) {
                if((int)sentence.charAt(i) == base[j][0] && base[j][1] != 1) {
                    //System.out.println(true + " " + j);
                    base[j][1] = 1;

                    for (int[] ints : base) {
                        s += ints[1];
                    }
                }
            }
        }

        /*for (int[] ints : base) {
            System.out.print(ints[0] + " ");
            System.out.println(ints[1] + "/");
        }*/

        //System.out.println("Resultado: " + s);
        return s == 26;
    }
}
