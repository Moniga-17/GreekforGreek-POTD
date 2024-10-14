//https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node cur = head;
        int n=0;
        while(cur!=null){
            n++;
            cur = cur.next;
        }
        return n;
    }
}
