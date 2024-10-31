//https://www.geeksforgeeks.org/problems/insert-in-sorted-way-in-a-sorted-dll/1

class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node newNode = new Node(x);
        
        if (head == null) {
            return newNode;
        }
        if (head.data >= newNode.data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        Node current = head;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        newNode.next = current.next;
        if (current.next != null) {
            newNode.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list:");
        int n = scanner.nextInt();

        Node head = null;
        Node tail = null;
        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        System.out.println("Enter the value to be inserted:");
        int x = scanner.nextInt();

        Solution solution = new Solution();
        head = solution.sortedInsert(head, x);

        System.out.println("Modified list:");
        printList(head);
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
