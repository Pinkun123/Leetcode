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
    public ListNode oddEvenList(ListNode head) {
        if( head == null){
            return head;
        }

        ListNode odd=head;
        ListNode even=head.next;

        // asgin even head
        ListNode evenHead=even;

        while(even != null && even.next != null){
            // change odd pointer
            odd.next=odd.next.next; // we know odd.next is allways even index so
            odd=odd.next;// update

            // change even pointer
            even.next=even.next.next;// we know even.next is allways odd index so
            even=even.next;// update
        }

        odd.next=evenHead;
        return head;
    }
}