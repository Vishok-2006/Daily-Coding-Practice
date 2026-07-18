import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class LinkedListImplementation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=new Node(n);
        head.next=new Node(20);
        head.next.next=new Node(30);
         Node temp=head;
         while(temp!=null){
            if(temp.next==null){ 
                System.out.print(temp.data); 
                break;
            }
            System.out.print(temp.data+" -> ");
            temp=temp.next;
         }
        









        sc.close();
    }
}
