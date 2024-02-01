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
    public ListNode mergeKLists(ListNode[] lists) {
        // if lists is empty
        if(lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }

        // create head node store the lists 0 index list
        ListNode head=lists[0];
        // itrate the lists for geting all index list
        for(int i=1;i<lists.length;i++){
            head=mergSort(head,lists[i]);
        }
        return head;
    }

    // mergSort function
    static ListNode mergSort(ListNode list1,ListNode list2){
        // create two pointer two track inedx of list1 and list2
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(100);
        // creart another pointer to track new head
        ListNode temp=head;

        while(temp1 != null && temp2 != null){
            // check value of both list
            if( temp1.val < temp2.val){
                // creat list node to store the sorted value
                ListNode a=new ListNode(temp1.val);
                temp.next=a;// tmep.next point the a node 
                temp=a;// then update temp
                temp1=temp1.next; // update
            }
            else{
                // creat list node to store the sorted value
                ListNode a=new ListNode(temp2.val);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }
        }

        // remaing part of the list

        if( temp1 == null){
           temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return head.next;
    }
}