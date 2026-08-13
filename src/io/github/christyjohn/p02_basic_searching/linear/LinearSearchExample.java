package io.github.christyjohn.p02_basic_searching.linear;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 199;

        System.out.println(linearSearch(nums, target));
    }

    // search in array: return the index if found
    // otherwise item not found, return -1
    public static int linearSearch(int[] arr, int target) {
        int index = -1;

        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target)
                    return i;
            }
        }

        return index;
    }
}
