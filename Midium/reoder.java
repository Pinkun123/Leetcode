/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class Solution {
    public void reorderList(ListNode head) {
        // this qustion look like in palindrom
        // find mid
        ListNode fast=head.next;
        ListNode slow=head;

        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode mid=slow;

        // reverse
        ListNode prev=null;
        ListNode curr=mid.next;
        mid.next=null;
        ListNode next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        // zig zag the List
        ListNode lh=head;  // left part head
        ListNode rh=prev; // right part head

        // using two temp pointer the store left head and right head valu
        ListNode leftNext;
        ListNode rightNext;

        // do zig zag or reoder
        while(lh !=null && rh != null){
            leftNext=lh.next; // leftnext point lh next
            lh.next=rh;
            rightNext=rh.next;
            rh.next=leftNext;
            //update
            lh=leftNext;
            rh=rightNext;
        }
    }
}