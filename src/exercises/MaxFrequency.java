package exercises;

import java.util.*;
import java.util.stream.Collectors;

import static javafx.scene.input.KeyCode.K;

public class MaxFrequency {

    public static void main(String[] arg) {


       int b = maxFrequency(new int[]{9930,9923,9983,9997,9934,9952,9945,9914,9985,9982,9970,9932,9985,9902,9975,9990,9922,9990,9994,9937,9996,9964,9943,9963,9911,9925,9935,9945,9933,9916,9930,9938,10000,9916,9911,9959,9957,9907,9913,9916,9993,9930,9975,9924,9988,9923,9910,9925,9977,9981,9927,9930,9927,9925,9923,9904,9928,9928,9986,9903,9985,9954,9938,9911,9952,9974,9926,9920,9972,9983,9973,9917,9995,9973,9977,9947,9936,9975,9954,9932,9964,9972,9935,9946,9966}, 3056);
        System.out.println("\n==========AQUI===========");
        System.out.println(b);
        /*int c = maxFrequency(new int[]{1,4,8,13}, 5);
        System.out.println("\n==========AQUI===========");
        System.out.println(c);
        int d = maxFrequency(new int[]{3,9,6}, 2);
        System.out.println("\n==========AQUI===========");
        System.out.println(d);
*/


    }
    public static int maxFrequency(int[] nums, int k) {


        int c = 0;
        boolean run = true;
        Arrays.sort(nums);

        if(nums.length == 1)
            return 1;

        while (run ) {
            int dif = 100001;
            int posI = 0;
            int posF = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i + 1] - nums[i] < dif && nums[i + 1] - nums[i] != 0) {
                    dif = nums[i + 1] - nums[i];
                    posI = i;
                    posF = i + 1;
                }
            }
            /*if (dif > k - c && dif != 100001){
                run = false;
            }*/
            if(run) {
                for (int j = c; j < k; j++) {
                    nums[posI]++;
                    c++;
                    if (nums[posI] == nums[posF])
                        break;
                }

                if (c == k) {
                    run = false;
                } else {
                    for (int i = 0; i < nums.length - 1; i++) {
                        if (nums[i + 1] - nums[i] == 0 && dif > k - c) {
                            run = false;
                            break;
                        }
                        run = true;
                    }
                }
            }

        }

        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        List<Integer> sortedFreq = freq.values().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(c);
        return sortedFreq.get(0);
    }
}
