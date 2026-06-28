package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class cycle{
    public static boolean hasCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        // Create linked list
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Create cycle
        n4.next = n2;

        Node head = n1;
        // Call your function here
        System.out.println(hasCycle(head));
    }
}