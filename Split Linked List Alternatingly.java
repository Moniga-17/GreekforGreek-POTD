//https://www.geeksforgeeks.org/problems/split-singly-linked-list-alternatingly/1

class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        Node head1=new Node(-1),head2=new Node(-1);
        Node cur1=head1,cur2=head2;
        while(head!=null){
            cur1.next=new Node(head.data);
            cur1=cur1.next;
            head=head.next;
            if(head!=null){
                cur2.next=new Node(head.data);
                cur2=cur2.next;
                head=head.next;
            }
        }
        return new Node[]{head1.next,head2.next};
    }
}
