package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class list {
    public static void main(String[] args) {
        System.out.println("list");
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        // n1.next.next=n3;
        n2.next=n3;
        Node temp=n1;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }
}
