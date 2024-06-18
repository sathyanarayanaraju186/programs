package org.dsalgo.leetcode;

/**
 * Let's call an array arr a mountain if the following properties hold:
 * <p>
 * arr.length >= 3 There exists some i with 0 < i < arr.length - 1 such that: arr[0] < arr[1] < ... arr[i-1] < arr[i] >
 * arr[i+1] > ... > arr[arr.length - 1] Given an integer array arr that is guaranteed to be a mountain, return any i
 * such that arr[0] < arr[1] < ... arr[i-1] < arr[i] > arr[i+1] > ... > arr[arr.length - 1].
 * <p>
 * example: arr = {1, 3, 5, 4, 2}, output = 2 example: arr = {0, 10, 5, 2}, output = 1 example: arr = {3, 4, 5, 1},
 * output = 2 example: arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19}, output = 2
 * <p>
 * The time complexity is O(log n) and the space complexity is O(1).
 */
public class MountainArray {
    public static void main(String... args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        System.out.print(peakIndexInMountainArray(arr));
    }

    // find the peak element in the mountain array using binary search
    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        // find the peak element, the element which is greater than its neighbors
        // continue the loop until the start and end are not equal
        while (start < end) {
            // find the middle element, avoid integer overflow for large numbers by using start + (end - start) / 2
            int mid = start + (end - start) / 2;

            // if the middle element is greater than the next element, then the peak element is on the left side
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            // if the middle element is less than the next element, then the peak element is on the right side
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        // return the peak element
        // At the end start == end, so we can return either start or end, because above two conditions will always have a peak element
        return start;
    }
}
