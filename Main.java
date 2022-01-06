package com.company;

import java.util.Arrays;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]+ nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }

        return null;
    }
    public static void main(String[] args) {
	int []num1 = {3,2,3};
    int []num2 = {2,5,5,11};
        System.out.println(Arrays.toString(twoSum(num1, 6)));
        System.out.println(Arrays.toString(twoSum(num2, 10)));

    }
}
