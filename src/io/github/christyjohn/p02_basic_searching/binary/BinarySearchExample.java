package io.github.christyjohn.p02_basic_searching.binary;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] nums = {-11, -3, 1, 2, 8, 16, 19, 23, 28, 45 };
        int target = 23;

        System.out.println(binarySearch(nums, target));
    }

    // search in array: return the index if found
    // otherwise item not found, return -1
    public static int binarySearch(int[] arr, int target) {
        int index = -1;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                    low = mid + 1;
            }
        }

        return index;
    }
}
