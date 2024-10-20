package com.amy.javabasics;

import java.util.Arrays;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Math_Arr {
    public static void main(String[] args) {
        int abs = Math.abs(123);
        int[] nums = new int[]{5,2,7,4};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
