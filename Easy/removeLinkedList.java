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
    public ListNode removeElements(ListNode head, int val) {
        // create dummy node for store head data
        ListNode dumy=new ListNode(-1);
        dumy.next=head; // dumy is point to the head;
        // create another node curr for itrate the full linked list which is point the dumy
        ListNode curr=dumy;

        while(curr.next != null){
            // check currnext.val and val is same
            if(curr.next.val == val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next; // update
            }
        }
        return dumy.next;
    }
}