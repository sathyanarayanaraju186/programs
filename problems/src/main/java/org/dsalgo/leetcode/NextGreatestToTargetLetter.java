package org.dsalgo.leetcode;

/**
 * This is a leetcode problem. Given a list of sorted characters letters containing only lowercase letters, and given a
 * target letter target, find the smallest element in the list that is larger than the given target.
 * <p>
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 * <p>
 * example: letters = ['c', 'f', 'j'], target = 'a', output = 'c' example: letters = ['c', 'f', 'j'], target = 'c',
 * output = 'f' example: letters = ['c', 'f', 'j'], target = 'd', output = 'f' example: letters = ['c', 'f', 'j'],
 * target = 'g', output = 'j' example: letters = ['c', 'f', 'j'], target = 'j', output = 'c'
 */

public class NextGreatestToTargetLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    // find the smallest element in the list that is larger than the given target
    private static char nextGreatestLetter(final char[] letters, final char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            // find the middle element, avoid integer overflow for large numbers by using start + (end - start) / 2
            int mid = start + (end - start) / 2;

            // if the middle element is greater than the target element
            if (letters[mid] > target) {
                end = mid - 1;
            }
            // if the middle element is less than or equal to the target element
            else {
                start = mid + 1;
            }
        }
        // return the smallest element in the list that is larger than the given target, if not found return the first element in the list.
        // start % (letters.length) is used to handle the case when start is greater than the length of the letters array.
        // For example, if the target is 'z' and the letters array is {'a', 'b', 'c'}, then start will be 3 and start % (letters.length) will be 0.
        return letters[start % (letters.length)];
    }
}

//c f j
//f > a So, end = 0
// c > a So, end = -1, start = 0
//  return c