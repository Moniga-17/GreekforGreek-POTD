//https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

 boolean isPalindrome(Node head) {
        // Your code here
        Node slow=head, fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node curr=slow.next, nxt=null, prev=null;
        slow.next=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        while(prev!=null){
            if(prev.data!=head.data)return false;
            prev=prev.next;
            head=head.next;
        }
        return true;
    
    }