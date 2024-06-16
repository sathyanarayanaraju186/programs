package org.dsalgo.leetcode;

/**
 * Given a sorted array of numbers, find the index of the largest number smaller than or equal to a given number in the
 * array using binary search. If the number is not present, return -1.
 * <p>
 * example: arr = {1, 2, 6, 23, 100}, target = 9, output = 2
 */
public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 23, 100};
        int target = 9;
        System.out.println(floor(arr, target));
    }

    private static int floor(final int[] arr, final int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
