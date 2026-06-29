package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class rev {
    public static void main(String[] args) {
        System.out.println("list");
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        n1.next=n2;
        // n1.next.next=n3;
        n2.next=n3;
        n3.next=n4;
        Node temp=n1;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        Node curr=n1;
        Node prev=null;
        while(curr!=null){
             Node next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
        }
        Node temp1=prev;
        while(temp1!=null){
            System.out.println(temp1.data+" ");
            temp1=temp1.next;
        }

    }
}
