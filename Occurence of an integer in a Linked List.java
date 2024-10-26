//https://www.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1

class Solution {
    public static int count(Node head, int key) {
        // code here
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                count++;
            }
            current = current.next;
        }
        return count;
    }
}
