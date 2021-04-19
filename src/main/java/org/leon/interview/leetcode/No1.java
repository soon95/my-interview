package org.leon.interview.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Leon Song
 * @date 2021-04-19
 */
public class No1 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 4};
        int target = 6;

        int[] res = twoSum(nums, target);

        System.out.println(Arrays.toString(res));


    }

    public static int[] twoSum(int[] nums, int target) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (set.contains(target - cur)) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] + nums[i] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{0, 0};
    }
}
