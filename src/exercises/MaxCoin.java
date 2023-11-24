package exercises;

import java.util.Arrays;

public class MaxCoin {

    public static void main(String[] args) {
        int b = maxCoins(new int[]{0,1,2,3,4,5,6,7,8});
        System.out.println("==========AQUI===========");
        System.out.println(b);
        int d = maxCoins(new int[]{2,4,1,2,7,8});
        System.out.println("==========AQUI===========");
        System.out.println(d);
        int c = maxCoins(new int[]{2,4,5});
        System.out.println("==========AQUI===========");
        System.out.println(c);
        int a = maxCoins(new int[]{9,8,7,6,5,1,2,3,4});
        System.out.println("==========AQUI===========");
        System.out.println(a);

    }

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int a, b = 0, maxCoins = 0 ;
        a = piles.length - 2;
        for (int i = a; i > 0 ; i -= 2 ) {
            maxCoins += piles[i];
            b++;
            if(i - b <= 1)
                break;
        }
        return maxCoins;
    }
}
