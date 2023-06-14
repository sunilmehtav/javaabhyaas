package com.udayan.dsa.algorithams;

public class KadaneMaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 3, -5, 2, 2, -1, 4, -3}));
    }

    public static int maxSubArray(int[] nums) {
        int localMaximum = 0;
        int globalMaximum = Integer.MIN_VALUE;
        for (int num : nums) {
            System.out.print("num = " + num);
            localMaximum = Math.max(localMaximum, num + localMaximum);
            System.out.print("    current = " + localMaximum);
            globalMaximum = Math.max(localMaximum, globalMaximum);
            System.out.println("   global = " + globalMaximum);
        }
        return globalMaximum;
    }

}
