import java.util.*;
 class Node{
    int data;
    Node next;
    public Node(int val){
            this.data=val;
            this.next=null;
    }
}
public class ListElementInsertion{
   public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         Node head =null;
         System.out.println("Enter the number of element you wish to insert in the node : ");
         int n=sc.nextInt(); 

// ====================================================================================

//                   INSERTION AT THE BEGINNING :

// =====================================================================================

        //  for(int i=0;i<n;i++){
        //     Node node=new Node(sc.nextInt());
        //        if(head==null) head=node;
        //        else{
        //         node.next=head;
        //         head=node;
        //        }
        //  }

//======================================================================================

                    
//                   INSERTION AT THE END :


//======================================================================================
             Node cure=head;
              for(int i=0;i<n;i++){
                   Node node=new Node(sc.nextInt());
                   cure=head;
                   if(head==null){
                      head=node;
                   }
                   else {
                         cure=head;
                        while(cure.next!=null){
                            cure=cure.next;
                        }
                         cure.next=node;  
                     
                   }
              }


//======================================================================


//                        INSERTING ELEMENT IN THE SPECIFIC POSITION :


//=======================================================================
        
               System.out.println("Specify the insert position:");
               int p=sc.nextInt();
               System.out.println("Specify the data:");
               cure =head;
               Node t=new Node(sc.nextInt());
               for(int i=0;i<p;i++){
                   cure = cure.next;
               }
               Node te=cure;
               cure = t;
               cure.next=te;












//==========================================================================


//                      PRINTING THE NODE ELEMENTS :


//==========================================================================

         Node cur=head;
        
         while(cur!=null)
            { if(cur.next==null){
                System.out.println(cur.data);
                break;
            }
            System.out.print(cur.data +" -> ");
            cur=cur.next;
         }






         sc.close();
   }
}