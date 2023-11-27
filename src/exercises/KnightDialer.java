package exercises;

import java.util.*;

public class KnightDialer {
    public static void main(String[] args) {
        int n = knightDialer(3);
        System.out.println("\n"+n);
    }

    public static int knightDialer(int n) {
        Map<Integer, List<Integer>> options = new HashMap<>();
        int[] arrayBase = {1,1,1,1,1,1,1,1,1,1};
        int result = 0;
        List<Integer> v0 = Arrays.asList(4,6);
        List<Integer> v1 = Arrays.asList(6,8);
        List<Integer> v2 = Arrays.asList(7,9);
        List<Integer> v3 = Arrays.asList(4,8);
        List<Integer> v4 = Arrays.asList(0,3,9);
        //List<Integer> v5 = Arrays.asList(null);
        List<Integer> v6 = Arrays.asList(0,1,7);
        List<Integer> v7 = Arrays.asList(2,6);
        List<Integer> v8 = Arrays.asList(1,3);
        List<Integer> v9 = Arrays.asList(2,4);

        options.put(0,v0);
        options.put(1,v1);
        options.put(2,v2);
        options.put(3,v3);
        options.put(4,v4);
        //options.put(5,v5);
        options.put(6,v6);
        options.put(7,v7);
        options.put(8,v8);
        options.put(9,v9);
        System.out.println(options);
        System.out.println("===== Antes ====");
        for(int a : arrayBase) {
            System.out.print(a+" ");
        }

        for (int i = 2; i <= n ; i++) {
            int[] arrayTemp = new int[10];
            for (int j = 0; j <= 9; j++){
                if(j != 5) {
                    for (int k : options.get(j)) {
                        arrayTemp[j] = (arrayTemp[j] + arrayBase[k]) % 1_000_000_007;
                    }
                }
            }
            arrayBase = arrayTemp;
        }
        System.out.println("\n==== Depois ====");
        for(int a : arrayBase) {
            System.out.print(a+" ");
        }
        for(int a : arrayBase) {
            result = (result + a) % 1_000_000_007;
        }
        return result;
    }
}
