"# leetcode-team-challenge" 

Average Salary:
-My approach was to find the total sum of the values in the salary array as that value is integral to finding the average (salary sum/ salary length)
-I also needed to find a way to the smallest and largest salaries, initially setting min and max to 0 did not work as those values were not being update (1000 < 0 -doesn't work)
-So i used extreme values instead (max = -2147483648, 1000 > -2147483648 or min = 2147483647, 1000 < 2147483647 this works)
-As i loop through the array i update the min and max values whilst accruing the total into totalSum
-I then subtract the min and max salaries from totalSum and save that new value into trueSum
-with trueSum i divide by length of salary array (subract 2 as we removed two values min and max from the calculus)

#PSEUDOCODE{

Set total to 0;
Set min to +infinity
Set max to -infinity

For every value in array{
	add to total
	check if each value is less than +/>infinity{
	"
		if it is its the new minimum
		compare that new minimum with each new iterated value 
		set to new min if its smaller
	}
	check if each value is greater than -infinity{
		if it is its the new maximum
		compare that new maximum with each new iterated value 
		set to new max if its larger
	}
}
remove min and max value from total
return new total/(salary length -2 (for min and max removed))
}

Squares of Sorted Array

-Approach brute force
-loop, square and sort

Create an empty result array of same length as input

For each number in input array:
    Square the number
    Add it to the result array

Sort the result array

return result array

--------------------------------
Task: Missing Number

I started by assuming that no number was missing, so I set the missing number to -1. Then, I decided to check every number from 0 to n (where n is the length of the array) to see if it was present. For each number in that range, I looped through the entire array to see if it existed. If I found it, I moved on to the next number. If I didn’t find it, I knew that was the missing number, so I saved it and stopped looking further. This approach made sure I found the missing number.

Pseudo Code:

Get listOfArrayList
Set endRange to the length of listOfArrayList
Set found to false
Set missingNum to - 1
For startRange = 0  To endRange
  Set false to found
  Loop Through listOfArrayList
    IF value of currentNumber =  startRange
      Set true to found
      End Loop
           IF Not Found
           Set startRange  =  missingNum
End of Loop Iteration
Return missingNum

--------------------------------
Task: Add Two Numbers

When I worked on this problem, I thought about how we add numbers on paper—starting from the right and carrying over when needed. Here, each number is stored backward in a linked list, meaning the ones place comes first, then the tens, and so on.
To make things simple, I created a dummy node to help build the result. I also kept track of a carry value, just like when adding by hand. For each step, I added the digits from both lists and included any leftover carry. If the sum was 10 or more, I kept the ones place in the result and carried over the tens place for the next step.
I moved through both lists, making sure to handle cases where one number was longer than the other. When all the digits were processed, I returned the result, skipping the dummy node. This way, I made sure everything was added correctly, even if the numbers had different lengths or if there was an extra carry at the end.

Pseudo Code:

FUnction addTwoNumbers(l1, l2):
  dummyHead = new ListNode(0)
  current = dummyHead
  carry = 0

  WHILE l1 is not NULL OR l2 is not NULL OR carry is not 0:
    sum = carry
then
    IF l1 is not NULL:
     sum = sum + l1.val
      l1 = l1.next
then
    IF l2 is not NULL:
      sum = sum + l2.val
      l2 = l2.next
next
    carry = sum / 10
    current.next = new ListNode(sum % 10)
    current = current.next

  RETURN dummyHead.next


--------------------------------
Task: Merge Two Sorted Lists

Approach:

Main Idea
I used a pointer (current) to build the merged list step-by-step, always choosing the smallest current node between list1 and list2.
To make it easy to handle the beginning of the merged list, I used a dummy node that acts as a temporary head.

Steps Taken:
-Create a Dummy Node
 a) This is a placeholder node that helps start the merged list without worrying about edge cases.
 b) I also created a current pointer, which always points to the last node in the new list.
 
-Use a While Loop to Compare Both Lists
 a)As long as neither list is finished:
     i) Compare list1.val and list2.val.
     ii) Attach the smaller node to current.next.
     iii) Move the list (either list1 or list2) forward.
     iv)  Move current forward as well.
     
-Attach the Remaining Part
  a) After the loop ends, one of the lists may still have nodes left.
  b) Since both lists are sorted, I can now just connect the rest of the unfinished list to current.next.
-Return the Head of the New List
  a) The real merged list starts from dummy.next.

Pseudo Code:
Class ListNode:
   Integer val
   ListNode next
   Constructor(val):
       Set this.val = val
       Set this.next = null

Function mergeTwoLists(list1, list2):
   Create a dummy node with value -1
   Set current = dummy
   WHILE list1 is not null AND list2 is not null:
       IF list1.val <= list2.val:
           current.next = list1
           list1 = list1.next
       ELSE:
           current.next = list2
           list2 = list2.next
       END IF
       Move current to current.next
   END WHILE
   IF list1 is not null:
       current.next = list1
   ELSE:
       current.next = list2
   END IF
   RETURN dummy.next

Create list1: 1 -> 2 -> 4
   Create list2: 1 -> 3 -> 4
   Call mergeTwoLists(list1, list2) → store result in mergedList
   WHILE mergedList is not null:
       PRINT mergedList.val
       mergedList = mergedList.next
