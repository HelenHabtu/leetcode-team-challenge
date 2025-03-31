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
		
		 // Create first list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create second list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Create an instance of Solution and merge the lists
        MergeLists sol = new MergeLists();
        ListNode merged = sol.mergeTwoLists(list1, list2);

        // Print the merged list: should be 1 1 2 3 4 4
        System.out.print("Merged List: ");
        while (merged != null) {
            System.out.print(merged.val + " ");  // Print each value
            merged = merged.next;                // Move to next node
        }
    }
}
	
	


