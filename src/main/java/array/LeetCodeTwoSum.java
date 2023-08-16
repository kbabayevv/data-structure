package array;

import java.util.Arrays;

public class LeetCodeTwoSum {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums1, 9)));
        int[] nums2 = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums2, 6)));
        int[] nums3 = {1, 8, 7, 4};
        System.out.println(Arrays.toString(twoSum(nums3, 6)));

    }

    /*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] newArr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    newArr[0] = i;
                    newArr[1] = j;
                    return newArr;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
