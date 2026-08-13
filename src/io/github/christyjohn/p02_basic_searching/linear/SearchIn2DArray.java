package io.github.christyjohn.p02_basic_searching.linear;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12},
                {}
        };

        System.out.println(Arrays.toString(searchIn2DArray(arr, 156)));
        System.out.println(maxIn2DArray(arr));
    }

    public static int[] searchIn2DArray(int[][] arr, int target) {
        int[] ans = { -1, -1 };

        if (arr.length == 0)
            return ans;
        else {
            for (int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == target) {
                        ans = new int[]{i, j};
                    }
                }
            }
        }
        return ans;
    }

    public static int maxIn2DArray(int[][] arr) {
        int ans = Integer.MIN_VALUE;

        if (arr.length == 0)
            return ans;
        else {
            for (int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] > ans) {
                        ans = arr[i][j];
                    }
                }
            }
        }
        return ans;
    }
}
