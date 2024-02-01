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
    public ListNode detectCycle(ListNode head) {
    //     // detect cycle 
    //     ListNode fast=head;
    //     ListNode slow=head;
    //     boolean cycle=false;
    //     while(fast != null && fast.next != null){
    //         if( fast == slow){// cycle detect
    //            cycle=true;
    //            break;
    //         }
    //         else{ // cycle not found
    //             cycle=false;
    //         }
    //     }

    //     //finding meeting point
    //     slow=head;  // again slow ptr start from head
    //     ListNode prev=null; // which track prev of fast ptr
    //     while(slow != fast){
    //         prev=fast;
    //        fast= fast.next;
    //         slow=slow.next;
    //     }

    //     // remove cycle last node become null which is prev
       
    //    return null;

    ////////////////////// 2nd aproche
      // detect cycle 
       ListNode slow=head;
       ListNode fast=head;

       while (fast != null && fast.next != null){
           slow=slow.next;
           fast=fast.next.next;
           if( fast == slow){
               // finding metting point
               slow=head;
               while( slow != fast){
                   slow=slow.next;
                   fast=fast.next;
               }
               return fast;
           }
       }
       return null;  
    }
}