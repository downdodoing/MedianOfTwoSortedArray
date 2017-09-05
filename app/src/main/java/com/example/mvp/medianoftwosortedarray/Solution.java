package com.example.mvp.medianoftwosortedarray;

/**
 * Created by MVP on 2017/9/5.
 */

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int curLength1 = 0, curLength2 = 0, curLength3 = 0;
        int length1 = nums1.length, length2 = nums2.length;

        int[] nums3 = new int[length1 + length2];

        while (curLength1 < length1 && curLength2 < length2) {
            if (nums1[curLength1] < nums2[curLength2]) {
                nums3[curLength3++] = nums1[curLength1++];
            } else {
                nums3[curLength3++] = nums2[curLength2++];
            }
        }
        while (curLength1 < length1 && curLength2 >= length2) {
            nums3[curLength3++] = nums1[curLength1++];
        }
        while (curLength2 < length2 && curLength1 >= length1) {
            nums3[curLength3++] = nums2[curLength2++];
        }
        int length3 = nums3.length;
        if (length3 % 2 != 0) {
            return nums3[length3 / 2];
        } else {
            return (nums3[length3 / 2] + nums3[length3 / 2 - 1]) / 2.0;
        }
    }
}
