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

		// 3. missing number test
		int[] nums2 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int missingNum = MissingNumber.missingNumber(nums2);
		System.out.println("The missing number is:  " + missingNum);

		// 4. Add Two Numbers
		// Create first list: 2 -> 4 -> 3
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		// Create second list: 5 -> 6 -> 4
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode AddedLinkedList = AddTwoNumbers.addTwoNumbers(l1, l2);

		System.out.print("Additon of these two linked list l1= [2, 4, 3] and l2 =[5, 6, 4] is ");
		while (AddedLinkedList != null) {
			System.out.print(AddedLinkedList.val + " "); // Print each value
			AddedLinkedList = AddedLinkedList.next; // Move to next node
		}
		System.out.println();

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
			System.out.print(merged.val + " "); // Print each value
			merged = merged.next; // Move to next node
		}

	}
}
