package io.github.christyjohn.p03_sorting.non_recursive;

import java.util.Arrays;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] nums = { 109, 56};
        System.out.println("Original array: " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));

        nums = new int[]{ 109, 56, 78};
        System.out.println("\nOriginal array: " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));

        nums = new int[]{ 109, 56, 2, 78, 109, 23, -4, -55};
        System.out.println("\nOriginal array: " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));

        nums = new int[]{ -109, 156, 22, 178, 109, 233, -34, -55};
        System.out.println("\nOriginal array: " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }

    public static void insertionSort(int[] nums) {
        // CLRS
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];

            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }

        // My trial - working but above is canonical way
        /*for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j-1] > nums[j]) {
                    int swap = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = swap;
                } else {
                    break;
                }
            }
        }*/
    }
}
