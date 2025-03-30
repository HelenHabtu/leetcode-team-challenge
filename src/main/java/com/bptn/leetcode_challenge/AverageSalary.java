package com.bptn.leetcode_challenge;

public class AverageSalary {
	 public static double average(int[] salary) {
	        int totalSum=0;
	        int max=Integer.MIN_VALUE;
	        int min=Integer.MAX_VALUE;
	        int trueSum = 0;
	        for (int s : salary) {
	            totalSum += s;
	            if (s < min){
	                min = s;
	            } 
	            if (s > max) {
	                max = s;
	            }
	        }
	    trueSum = totalSum - min - max;
	    return (double) trueSum/(salary.length -2);
	    }
}
