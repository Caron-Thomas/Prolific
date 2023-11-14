package exercises;

public class TwoSum {
    public static void main(String[] arg) {
        twoSum(new int[]{2,7,11,15}, 9);
        twoSum(new int[]{3,2,4}, 6);
        twoSum(new int[]{3,3}, 6);
        twoSum(new int[]{2,7,11,15}, 18);
        twoSum(new int[]{2,7,11,1}, 12);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] resp = new int[2];
        for(int i = 0; i < nums.length - 1 ; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resp[0] = i;
                    resp[1] = j;
                    System.out.println("[ " + resp[0] + " " + resp[1] + " ]" );
                    return resp;
                }
            }
        }
        return resp;
    }
}
