import java.util.*;


class Node{
    int data;
    Node next;
    Node prev;
    public Node(int val){
         this.data=val;
    }
}


public class DeletionAtTheLinkedList {
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
//===============================================================

//               ELEMENT DELETION AT SPECIFIC POSITION :

//================================================================

         System.out.println("Enter the element to position:");
         int p=sc.nextInt();
         Node temp=head;
         for(int i=1;i<p;i++){
             temp=temp.next;
         }
         temp.next.prev=temp.prev;
         temp.prev.next=temp.next;
        
          sc.close();
          Node cur=head;
             while(cur!=null){
                  if(cur.next==null){
                    System.out.println(cur.data);
                    return;
                  }
                    System.out.print(cur.data+" <----> ");
                
                
                cur=cur.next;
             }


            

}
}
