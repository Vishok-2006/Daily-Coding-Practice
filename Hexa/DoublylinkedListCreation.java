import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    public Node(int val){
         this.data=val;
    }
}
public class DoublylinkedListCreation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert the no of values need to be added");
        int n=sc.nextInt();
        System.out.println("Enter the elments:");

//===================================================================================


//                          GETTING ELEMENT AS INPUT :


//=====================================================================================
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++){
            Node no=new Node(sc.nextInt());
            if(head==null){
                head=no;
                tail=no;
            }
            else{
                tail.next=no;
                no.prev=tail;
                tail=no;
            }
        }



//============================================================


//                TRAVERSING AND PRINTING THE ELEMENTS :


//=============================================================

         System.out.println("Starting to printing:" );
       Node cur=head;
       while(cur!=null){
        if(cur.next==null){
            System.out.println(cur.data);
            break;
        }
        System.out.print(cur.data +" <-> ");
        cur=cur.next;
       }



        sc.close();
    }
}
