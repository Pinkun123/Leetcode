/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        // if(head == null){
        //     return null;
        // }
        // Node curr=head;

        // // create copy node
        // while(curr != null){
        //     Node temp=curr.next;
        //     curr.next=new Node(curr.val); // copy
        //     curr.next.next=temp;
        //     curr=temp;
        // }

        // // setting rndom pointer two newNode
        // while(curr != null){
        //     if(curr.next != null){
        //         // curr.next.random=(curr.random != null) ? curr.random.next : null;
        //          curr.next.random = curr.random.next;
        //     }
        //     curr=curr.next.next;
        // }

        // // break the midile pointer which is conect both copy and orginal pointer
        // Node org=head;
        // Node copy=head.next;
        // Node temp=copy;

        // while(curr != null){
        //     org.next=org.next.next;
        //     copy.next=copy.next.next;
        //     org=org.next;
        //     copy=copy.next;
        // }
        // return temp;


        // chat gpt code   

          if (head == null) {
            return null;
        }

        // Step 1: Create copy nodes and insert them between original nodes
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Set random pointers for copied nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the original and copied nodes
        Node newHead = head.next;
        curr = head;
        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;
            if (copy.next != null) {
                copy.next = copy.next.next;
            }
            curr = curr.next;
        }

        return newHead;
    }
}