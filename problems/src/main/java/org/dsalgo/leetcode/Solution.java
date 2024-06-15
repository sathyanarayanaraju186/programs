package org.dsalgo.leetcode;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        String[] as = a.split("");
        String[] bs = b.split("");

        Stack<Integer> aStack = new Stack<>();
        Stack<Integer> bStack = new Stack<>();
        int maxLength = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLength; i++) {
            if (a.length() > i) {
                aStack.push(Integer.valueOf(as[i]));
            }
            if (b.length() > i) {
                bStack.push(Integer.valueOf(bs[i]));
            }
        }
        int temp = 0;
        StringBuilder addedBinary = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            int a1 = 0;
            if (a.length() > i) {
                a1 = aStack.pop();
            }
            int b1 = 0;
            if (b.length() > i) {
                b1 = bStack.pop();
            }
            if (a1 > 0 && b1 > 0) {
                if (temp > 0) {
                    addedBinary.insert(1, 0);
                } else {
                    addedBinary.insert(0, 0);
                    temp = 1;
                }
            } else if (a1 == 0 && b1 == 0) {
                addedBinary.insert(0, 0);
            } else {
                if (temp > 0 && (a1 > 0 || b1 > 0)) {
                    addedBinary.insert(0, 0);
                } else {
                    addedBinary.insert(1, 0);
                }
            }
        }
        if (temp > 0) {
            addedBinary.insert(1, 0);
        }
        if (addedBinary.charAt(0) == 0) {
            addedBinary.deleteCharAt(0);
        }
        return addedBinary.toString();
    }
}