package org.leon.interview.leetcode;

import java.util.Arrays;

/**
 * @author Leon Song
 * @date 2021-04-19
 */
public class No27 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int res = removeElement(nums, val);

        System.out.println(res);

        System.out.println(Arrays.toString(nums));


    }


    public static int removeElement(int[] nums, int val) {

        int length = nums.length;

        boolean[] match = new boolean[length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == val) {
                length--;
                match[i] = true;
            }
        }
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!match[i]) {
                nums[index++] = nums[i];
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

        return length;
    }

}
