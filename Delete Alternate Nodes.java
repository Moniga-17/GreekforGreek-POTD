//https://www.geeksforgeeks.org/problems/delete-alternate-nodes/1

class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        Node cur = head;
        while(cur!=null && cur.next!=null){
            cur.next = cur.next.next;
            cur = cur.next;
        }
    }
}
