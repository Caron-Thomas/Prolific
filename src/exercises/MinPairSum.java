package exercises;

import java.util.Arrays;

public class MinPairSum {

    static int[] nums = {3, 5 , 2 , 3};
    static int[] nums1 = {3, 5, 4, 2, 4, 6};
    static int[] nums2 = {2, 3 , 5 , 3};

    public static void main(String[] arg){
        System.out.println("\n" + minPairSum(nums ));
        System.out.println("\n" + minPairSum(nums1));
        System.out.println("\n" + minPairSum(nums2));
    }

    public static int minPairSum(int[] nums) {
        int mmp = 0;
        int temp = 0;
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length/2; i++) {
            temp = nums[i] + nums[nums.length  - 1 - i];
            if(temp > mmp)
                mmp = temp;
        }
        return mmp;
    }
}
