package org.eddie.leetcode;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int a = 0, b = nums.length - 1;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                b = mid - 1;
            else
                a = mid + 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int a = searchInsert(nums, 2);
        System.out.println(a);
    }
}
