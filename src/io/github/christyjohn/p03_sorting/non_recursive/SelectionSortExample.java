package io.github.christyjohn.p03_sorting.non_recursive;

import java.util.Arrays;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] nums = { 109, 56, 2, 78, 109, 23, -4, -55};
        selectionSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));

        nums = new int[]{ -109, 156, 22, 178, 109, 233, -34, -55};
        selectionSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {
        System.out.println("Original array: " + Arrays.toString(nums));

        for(int i = nums.length - 1; i >= 0; i--) {
            int max = nums[i];
            int maxIndex = i;

            for (int j = 0; j < i; j++) {
                if (nums[j] > max) {
                    maxIndex = j; // the maximum value
                }
            }

            if (maxIndex != i) {
                int swap = nums[i];
                nums[i] = max;
                nums[maxIndex] = swap;
            }

        }
    }
}
