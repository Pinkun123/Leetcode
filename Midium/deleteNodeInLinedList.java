/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    //    if( == null){ // 
    //        return;
    //    }

    //    ListNode prev=val; // create newnode store value
    //    ListNode curr=node.next.val;

    //    // swap or copy the data
    //    prev.val=curr.val;

    //    // the prev.next to point to current next
    //    prev.next=prev.next.next;
    //    return;

    node.val=node.next.val;
    node.next=node.next.next;
    }
}