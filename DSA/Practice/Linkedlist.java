import java.util.*;

public class Linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newnNode=new Node(data);
        if (head==null) {
            head=tail=newnNode;
            return;
        }
        newnNode.next=head;
        head=newnNode;
    }

    public void addlast(int data){
        Node newnNode=new Node(data);
        if (head==null) {
            head=tail=newnNode;
            return;
        }
        tail.next=newnNode;
        tail=newnNode;
    }
    public void printll(){
        if (head==null) {
            System.out.println("LL Is Empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addmiddle(int idx,int data){
        
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
        ll.printll();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.printll();
    }
}
