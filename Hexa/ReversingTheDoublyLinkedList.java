
import java.util.*;


class Node{
    int data;
    Node next;
    Node prev;
    public Node(int val){
         this.data=val;
    }
}


public class ReversingTheDoublyLinkedList {
    

     public static void main(String[] args) {
        
    
      Scanner sc =new Scanner(System.in);
        System.out.println("Insert the no of values need to be added");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");

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


//===============================================================================

//                PRINTING IN REVERSE SECTION :

//===============================================================================
          Node cur=head;
          sc.close();
          while(cur.next!=null){
            cur=cur.next;
          }
             while(cur!=null){
                  if(cur==head){
                    System.out.println(cur.data);
                    return;
                  }
                    System.out.print(cur.data+" <----> ");
                
                
                cur=cur.prev;
             }


            

}
}
