// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     static ListNode findMid(ListNode head){
//         // using two pointer
//         ListNode fast=head.next;
//         ListNode slow=head;
//         if(fast != null  && fast.next != null){
//             fast=fast.next.next; //move 2 point
//             slow=slow.next; // move 1 point
//         }
//         return slow; // mid
//     }
//     public ListNode sortList(ListNode head) {
//         // base case
//         if(head == null || head.next == null){
//             return head;
//         }
//         // find mid
//         ListNode mid=findMid(head);
        

//         // sort left and right side 
//         ListNode left=head;
//         ListNode right=mid.next;
//         mid.next=null; // seprate both side
        
//         ListNode newLeft=sortList(left);// sorted left part
//         ListNode newRight=sortList(right);// sorted left part

//         // merged both sorted part
//         return merg(newLeft,newRight);
//     }

//     static ListNode merg(ListNode head1,ListNode head2){
//         ListNode  newLL=new ListNode(-1);
//         ListNode temp=newLL; // which is point head of newLL

//         while(head1 != null && head2 != null){
//             if(head1.val <= head2.val){
//                 temp.next=head1;
//                 head1=head1.next;// update
//                 temp=temp.next;
//             }
//             else{
//                 temp.next=head2;
//                 head2=head2.next; // update
//                 temp=temp.next;
//             }
//         }
//         // remaing part of the left side
//         while(head1 != null){
//             temp.next=head1;
//             head1=head1.next;
//             temp=temp.next;
//         }

//         // remaing part of the right side
//         while(head2 != null){
//             temp.next=head2;
//             head2=head2.next;
//             temp=temp.next;
//         }
//         return newLL.next;
//    }
   
// }

//2nd code for est case pass
public class Solution {
  
    public ListNode sortList(ListNode head) {
      if (head == null || head.next == null)
        return head;
          
      // step 1. cut the list to two halves
      ListNode prev = null, slow = head, fast = head;
      
      while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
      }
      
      prev.next = null;
      
      // step 2. sort each half
      ListNode l1 = sortList(head);
      ListNode l2 = sortList(slow);
      
      // step 3. merge l1 and l2
      return merge(l1, l2);
    }
    
    ListNode merge(ListNode l1, ListNode l2) {
      ListNode l = new ListNode(0), p = l;
      
      while (l1 != null && l2 != null) {
        if (l1.val < l2.val) {
          p.next = l1;
          l1 = l1.next;
        } else {
          p.next = l2;
          l2 = l2.next;
        }
        p = p.next;
      }
      
      if (l1 != null)
        p.next = l1;
      
      if (l2 != null)
        p.next = l2;
      
      return l.next;
    }
  
  }