// Created by ilkhom on 31.10.2023

// Problem  Description
// **************************************
// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must be unique and you may return the result in any order.
// **************************************

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        // HashSet does not allow duplicate values
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                intersection.add(i);
            }
        }
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int i : intersection) {
            result[index++] = i;
        }
        return result;
    }
}