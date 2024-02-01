/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastPtr=head;
        ListNode slowPtr=head;

        while (fastPtr != null && fastPtr.next != null){
            fastPtr=fastPtr.next.next; // move 2 step
            slowPtr=slowPtr.next;// move 1 step
            // both are on same step
            if(fastPtr == slowPtr){
                return true;
            }
        }
        return false;
    }
}