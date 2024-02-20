package exercises;

import java.util.Arrays;
import java.util.List;

public class BinaryTree {

    public static void main(String[] args) {

        List<Integer> three = Arrays.asList(1,2,3,4);
        String g = tree2str(three);
        System.out.println(g);


        int[] arr = {1,2,3,4,5};
        int l = 5;
        System.out.println(sum(arr, l));

    }

    public static int sum(int[] ints, int length) {
        if(length == 0)
            return 0;

        return ints[length - 1] + sum(ints, length - 1);
    }
    public static String tree2str(List<Integer> root) {

        return "Iarru";
    }
}
