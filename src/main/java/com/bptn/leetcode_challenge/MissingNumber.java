package com.bptn.leetcode_challenge;

public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int endRange = nums.length;
		boolean found = false;
		// Returns -1 if no number is missing
		int missingNum = -1;

		for (int startRange = 0; startRange <= endRange; startRange++) {
			// reset found to false in every new interation
			found = false;

			for (int index = 0; index < nums.length; index++) {

				// Update found status when match is detected
				if (nums[index] == startRange) {
					found = true;
					// if the range is found we exited from the inner loop
					break;
				}
			}
			// If number isn't in array, it's our missing value
			if (!found) {
				missingNum = startRange;
				break;
			}
		}

		return missingNum;

	}

}
