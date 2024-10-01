//https://www.geeksforgeeks.org/problems/multiply-two-linked-lists/1

class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long mod = (long) Math.pow(10, 9) + 7;
        long n1 = 0;
        long n2 = 0;
        while(first != null) {
            n1 = (n1*10 + first.data)%mod;
            first = first.next;
        }
        
        while(second != null) {
            n2 = (n2*10 + second.data)%mod;
            second = second.next;
        }
        
        return (n1*n2)%mod;
    }
}
