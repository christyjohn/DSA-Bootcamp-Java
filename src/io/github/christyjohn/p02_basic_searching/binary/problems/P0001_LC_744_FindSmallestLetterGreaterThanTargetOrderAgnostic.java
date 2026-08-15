package io.github.christyjohn.p02_basic_searching.binary.problems;

/**
 * Given a sorted array find the smallest element in array
 * greater than or equal to number
 */
public class P0001_LC_744_FindSmallestLetterGreaterThanTargetOrderAgnostic {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        int target = 3;
        System.out.println(findCeilingNumber(nums, target)); // 3

        nums = new int[]{ 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        target = 5;
        System.out.println(findCeilingNumber(nums, target)); // -1

        nums = new int[]{-11, -3, 1, 2, 8, 16, 19, 23, 28, 45 };
        target = 50;
        System.out.println(findCeilingNumber(nums, target)); // -1

        nums = new int[]{ 149, 98, 85, 65, 32, 19, 12, 3, -28, -114 };
        target = 99;
        System.out.println(findCeilingNumber(nums, target)); // -1

        nums = new int[]{ 149, 98, 85, 65, 32, 19, 12, 3, -28, -114 };
        target = 170;
        System.out.println(findCeilingNumber(nums, target)); // -1
    }

    public static int findCeilingNumber(int[] arr, int target) {
        int ceiling = -1;

        int low = 0;
        int high = arr.length - 1;

        if (arr[low] == arr[high]) {
            if (arr[low] >= target)
                ceiling = arr[low];
            return ceiling;
        }

        if ( (arr[low] < arr[high])) {
            if (target < arr[low])
                return arr[low];
            else if (target > arr[high])
                return ceiling;
        } else if ( (arr[low] > arr[high])) {
            if (target < arr[high])
                return arr[high];
            else if (target > arr[low])
                return ceiling;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            boolean flag = false;

            if (arr[low] < arr[high])
                flag = target < arr[mid];
            else if (arr[low] > arr[high])
                flag = target > arr[mid];

            if (target == arr[mid]) {
                ceiling = arr[mid];
                break;
            } else {
                if (flag)
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            if (low >= high) {
                ceiling = arr[low];
                break;
            }
        }

        return ceiling;
    }
}
