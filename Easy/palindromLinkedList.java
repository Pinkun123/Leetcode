/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode findMid(ListNode head){
        //two pointer
        ListNode slowPtr=head;
        ListNode fastPtr=head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
        }
        
        // mid 
        ListNode mid=slowPtr;
        return mid;
    }

    public boolean isPalindrome(ListNode head) {
        // baas case
        if(head == null || head.next == null){
            return true;
        }
        // findMid
          ListNode mid=findMid(head);
        // reverse 2nd half
          ListNode prev=null;
          ListNode curr=mid;
          ListNode next;
          while(curr != null){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
          }
          
          ListNode right=prev;  // right revers head
          ListNode left=head;  // left reverse
           
        // check palindrom

        while(right != null){
            if(left.val != right.val){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
}