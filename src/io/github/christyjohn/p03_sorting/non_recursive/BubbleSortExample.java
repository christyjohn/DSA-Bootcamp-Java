package io.github.christyjohn.p03_sorting.non_recursive;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] nums = { 3, 56, 2, 78, 109, 23, -4, 5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{ -3, -56, -2, -78, -109, -23, 4, -5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            boolean swapped = false;

            for (int j = 0; j < nums.length - (i + 1); j++) {
                if (nums[j] > nums[j + 1]) {
                    int swap = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = swap;
                    swapped = true;
                }
            }

            // If no two elements were swapped by the inner loop, the array is sorted!
            if (!swapped) {
                break;
            }
        }
    }
}
