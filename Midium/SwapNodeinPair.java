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
    public ListNode swapPairs(ListNode head) {
       // creat dumy node for itrate the linklist
       ListNode dummy=new ListNode(0);
       dummy.next=head;

       // creat anothe linkList to pointer 
       ListNode point=dummy;

       while(point.next != null && point.next.next != null){
           //idnitfy nodes to swap
           ListNode swap1=point.next;
           ListNode swap2=point.next.next;

           // actual swap
           swap1.next=swap2.next;
           swap2.next=swap1;
           point.next=swap2;
           point=swap1;
       }
       return dummy.next;
    } 
}