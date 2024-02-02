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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // crwate a dummy node is mark head of list
        ListNode dumy=new ListNode(0);
        dumy.next=head;

        //make markers for 
        ListNode leftPrev=dumy;
        ListNode currNode=head;

        for(int i=0;i<left-1;i++){
            leftPrev=leftPrev.next;
            currNode=currNode.next;
        }

        // reverse
        ListNode subListHead=currNode;
        ListNode prev=null;
        ListNode next;
        for(int i=0;i<right-left+1;i++){
             next=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=next;
        }

        //
        leftPrev.next=prev;
        subListHead.next=currNode;
        return dumy.next;
    }
}