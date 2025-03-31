package com.bptn.leetcode_challenge;

//Class that contains the mergeTwoLists method
class MergeLists {

 // Method to merge two sorted linked lists
 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

     // Create a dummy node to act as the start of the merged list
     // This helps avoid special cases for the head of the list
     ListNode dummy = new ListNode(-1);

     // 'current' is a pointer that we use to build the new list
     ListNode current = dummy;

     // Traverse both lists until one becomes null
     while (list1 != null && list2 != null) {
         // If list1's value is smaller or equal, attach it to the merged list
         if (list1.val <= list2.val) {
             current.next = list1;    // Connect current to list1
             list1 = list1.next;      // Move list1 forward
         } else {
             // Otherwise, attach list2's node to the merged list
             current.next = list2;    // Connect current to list2
             list2 = list2.next;      // Move list2 forward
         }

         // Move current to the newly added node
         current = current.next;
     }

     // At this point, one list is fully traversed.
     // Attach the rest of the non-null list (if any) to the merged list
     if (list1 != null) {
         current.next = list1;
     } else {
         current.next = list2;
     }

     // The merged list starts at dummy.next (dummy was just a placeholder)
     return dummy.next;
 }
}
