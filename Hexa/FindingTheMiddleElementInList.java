import java.util.*;


class Node{
    int data;
    Node next;

    public Node(int val){
         this.data=val;
    }
}
public class FindingTheMiddleElementInList {
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
//===============================================================

//               FINDING THE MIDDLE NODE :

//================================================================
    
               Node s=head;
               Node f=head;
               while(f!=null && f.next!=null){
                s=s.next;
                f=f.next.next;
               }

          System.out.println("The middle node is : "+s.data);

          System.out.println();



//==============================================================================


//                   Printing Section :


//===============================================================================


          
             Node cur=head;
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