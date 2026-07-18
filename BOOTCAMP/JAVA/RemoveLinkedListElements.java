public class RemoveLinkedListElements {
     
 ListNode head=null;
    
    public static void main(String[] args){
       
    }
    public ListNode removeElements(ListNode head, int val) {

        //Iterative
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode cur = temp;
        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            } else{
                cur = cur.next;
            }
        }
        return temp.next;
    }
}
      
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
