package main;

//Questão 3: Números que somam a um alvo
//Dado um array de inteiros não ordenado, escreva um método que encontre dois números que, ao serem somados, resultem em um valor alvo. Retorne os índices desses números.
//Entrada: nums = [2, 7, 11, 15], alvo = 9
//Saída: [0, 1] (porque nums[0] + nums[1] == 9)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumTarget {

    public static void main(String[] args) {
        int[] nums = {2, 12, 11,15,7};
        int alvo = 26;

        int[] ints = twoSum(nums, alvo);
        System.out.println(Arrays.toString(ints));

        int[] ints1 = twoSumWithMap(nums, alvo);
        System.out.println(Arrays.toString(ints1));

    }

    public static int[] twoSum(int[] nums, int alvo) {
        int[] result = {-1,-1};

        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if(alvo - nums[i] == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSumWithMap(int[] nums, int alvo) {
        Map<Integer, Integer> target = new HashMap<>();
        int helper;

        for (int i = 0; i < nums.length; i++) {
            helper = alvo - nums[i];

            if(target.containsKey(helper)) {
                return new int[] {target.get(helper), i};
            }
            target.put(nums[i], i);
        }
        return new int[]  {-1,-1};
    }


}
