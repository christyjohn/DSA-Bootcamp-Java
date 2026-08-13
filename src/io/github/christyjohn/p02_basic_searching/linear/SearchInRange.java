package io.github.christyjohn.p02_basic_searching.linear;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 , 199};
        int target = 19;

        System.out.println(linearSearch(nums, target, 2, 6));
    }

    public static boolean linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0)
            return false;
        else {
            for (int i = start; i <= end; i++) {
                if(arr[i] == target)
                    return true;
            }
        }

        return false;
    }
}
