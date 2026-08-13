package io.github.christyjohn.p02_basic_searching.linear;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        //int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 , 199};
        int[] nums = {};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < minValue)
                minValue = i;
        }

        return minValue;
    }
}
