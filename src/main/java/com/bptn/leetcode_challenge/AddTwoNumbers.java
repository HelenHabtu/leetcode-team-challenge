package com.bptn.leetcode_challenge;

public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Create a starting point for our answer list
		ListNode dummyHead = new ListNode(0);
		// This will point to where we add new numbers
		ListNode current = dummyHead;
		// This remembers if we need to carry over a 1
		int carry = 0;

		// Keep going until we process all numbers and any leftover carry
		while (l1 != null || l2 != null || carry != 0) {
			// Start with just the carry value
			int sum = carry;

			// Add the current digit from first number (if it exists)
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next; // Move to next digit
			}

			// Add the current digit from second number (if it exists)
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next; // Move to next digit
			}

			// Figure out what to store and what to carry
			carry = sum / 10; // The "tens" digit becomes our new carry
			current.next = new ListNode(sum % 10); // The "ones" digit goes in our answer
			current = current.next; // Move to the next spot in our answer
		}

		// Return the answer, skipping our initial dummy node
		return dummyHead.next;
	}
}