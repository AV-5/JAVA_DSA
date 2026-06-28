package linkedlist;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class insert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        head.next=n2;
        n2.next=n3;
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("Enter the location to insert: ");
        int pos=sc.nextInt();
        System.out.println("Enter the data");
        int d=sc.nextInt();
        Node n=new Node(d);
        
        //first
        if(pos==1){
            n.next=head;
        }
        //at position
        Node temp1=head;
        for(int i=1;i<pos-1 && temp1!=null;i++ ){
            temp1.next=n.next;
            temp1.next=n;
        }
        n.next=temp1.next;
        temp1.next=n;

        Node temp2=head;
        while(temp2!=null){
            System.out.println(temp2.data);
            temp2=temp2.next;
        }
    }
}
