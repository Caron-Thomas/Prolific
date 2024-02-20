package exercises;

public class NumberOfBits {

    public static void main(String[] args) {

        System.out.println("\n" + hammingWeight(00000000000000000000000000001011));

    }
    public static int hammingWeight(int n) {
        String ns = String.valueOf(n);
        System.out.println(ns);
        int[] bit = new int[32];

        int r = 0;
        for (int i = 0; i < ns.length(); i++) {
            bit[i] = ns.charAt(i);
        }

        for (int i = 0; i < 32; i++) {
            System.out.print(bit[i] + " ");
            r += bit[i];
        }
        return r;
    }
}
