package com.bptn.leetcode_challenge;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] salary = { 4000, 3000, 1000, 2000 };
		double result = AverageSalary.average(salary);
		System.out.println("Average salary (excluding min/max): " + result);

		int[] nums = { -4, -1, 0, 3, 10 };
		int[] result2 = SortedSquares.sortedSquares(nums);

		System.out.println("Sorted squares: " + Arrays.toString(result2));
	}
}
