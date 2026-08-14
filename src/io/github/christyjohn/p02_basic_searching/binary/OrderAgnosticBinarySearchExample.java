package io.github.christyjohn.p02_basic_searching.binary;

public class OrderAgnosticBinarySearchExample {
    public static void main(String[] args) {

        int[] nums = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        int target = 3;

        System.out.println(binarySearch(nums, target));

        nums = new int[]{-11, -3, 1, 2, 8, 16, 19, 23, 28, 45 };
        target = 16;

        System.out.println(binarySearch(nums, target));

        nums = new int[]{ 149, 98, 85, 65, 32, 19, 12, 3, -28, -114 };
        target = -28;

        System.out.println(binarySearch(nums, target));
    }

    // search in array: return the index if found
    // otherwise item not found, return -1
    public static int binarySearch(int[] arr, int target) {
        int index = -1;

        int low = 0;
        int high = arr.length - 1;

        if (arr[low] == arr[high]) {
            if (target == arr[low]) {
                index = low;
                return index;
            }
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            boolean flag = false;

            if (arr[low] < arr[high]) {
                flag = target < arr[mid];
            } else if (arr[low] > arr[high]) {
                flag = target > arr[mid];
            }

            if (arr[mid] == target) {
                index = mid;
                break;
            } else {
                if (flag)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }

        return index;
    }
}
