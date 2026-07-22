import java.util.*;
class Node{
    int data;
   Node next;
    public Node(int val){
        this.data=val;
    
    }
}
public class LinkedListCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();

//================================================================================         


//                     INPUT SECTION :


//=================================================================================         
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
  //===============================================================================     


//                        PRINTING SECTION :


//==================================================================================        
         Node temp=head;
         while(temp!=null){
            if(temp.next==null){ 
                System.out.print(temp.data+" -> Null "); 
                break;
            }
            System.out.print(temp.data+" -> ");
            temp=temp.next;
         }
        









        sc.close();
    }
}
