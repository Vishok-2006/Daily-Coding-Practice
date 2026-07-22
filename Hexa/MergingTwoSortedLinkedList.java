import java.util.*;
class Node{
    int data;
    Node next;
  
    public Node(int val){
         this.data=val;
    }
}
public class MergingTwoSortedLinkedList {
     public static void main(String[] args) {
        
    
      Scanner sc =new Scanner(System.in);
        System.out.println("Insert the no of values need to be added");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");

//===================================================================================


//                          GETTING ELEMENT AS INPUT FOR FIRST NODE :


//=====================================================================================

        Node head1=null;
        Node temp1=null;
        for(int i=0;i<n;i++){
            Node no=new Node(sc.nextInt());
            if(head1==null){
                head1=no;
                temp1=no;
            }
            else{
                temp1.next=no;
                temp1=temp1.next;
            }
        }
//==============================================================================

            
//                        GETTING ELEMENT AS INPUT FOR SECOND NODE :


//==============================================================================
                System.out.println("Enter the no of elements need to be in the List:");
                int m=sc.nextInt();
                Node head2=null;
                Node temp2=null;
                for(int i=0;i<m;i++){
                      Node no1=new Node(sc.nextInt());
                      if(head2==null){
                            head2=no1;
                            temp2=no1;
             
                        }
                      else{
                             temp2.next=no1;
                             temp2=temp2.next;
                          }
                   }

//===============================================================================
        

                    Node head=new Node(0);
                    Node temp=head;
                    while(head1!=null && head2!=null){
                        if(head1.data<head2.data){
                            temp.next=head1;
                            head1=head1.next;
                        }
                        else{
                            temp.next=head2;
                            head2=head2.next;
                        }
                        temp=temp.next;
                    }
                    if(head1!=null){
                        temp.next=head1;
                    }
                    if(head2!=null){
                        temp.next=head2;
                    }




//===============================================================================

//                PRINTING SECTION :

//===============================================================================
          Node cur=head.next;
          sc.close();
        
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

