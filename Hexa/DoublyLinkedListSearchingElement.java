import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    public Node(int val){
         this.data=val;
    }
}

public class DoublyLinkedListSearchingElement {
    public static void main(String[] args) {
        
    
      Scanner s =new Scanner(System.in);
        System.out.println("Insert the no of values need to be added");
        int n=s.nextInt();
        System.out.println("Enter the elements:");

//===================================================================================


//                          GETTING ELEMENT AS INPUT :


//=====================================================================================
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++){
            Node no=new Node(s.nextInt());
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

//==================================================================================


//                        SEARCHING THE ELEMENTS :


//====================================================================================
            System.out.println("Enter the element need to be Searched:");
            int x=s.nextInt(); 
            Node cur=head;
             while(cur!=null){
                if(cur.data==x){
                    System.out.println("Element is Present In the List:");
                    return;
                }
                cur=cur.next;
             }
             System.out.print("Element is not Present in the list:");

              s.close();

} 
}
