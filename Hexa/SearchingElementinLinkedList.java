import java.util.*;

public class SearchingElementinLinkedList {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Node head=null;
         Node tail=null;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            Node d=new Node(x);
            if(head ==null){
                head=d;
                tail=d;
            }
            else{
                tail.next=d;
                tail=tail.next;
            }
        }
         int c=sc.nextInt();
        sc.close();

         Node temp=head;
         while(temp!=null){
             if(c==temp.data) {
                System.out.print("Element Found");
                return;
             }
              temp=temp.next;
         }
        System.out.print("Element Not Found");









    }
}



class Node{
    int data;
    Node next;
    public Node(int val){
        this.data=val;
        this.next=null;
    }
}
