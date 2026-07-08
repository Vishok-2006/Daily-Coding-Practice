public class RemoveLinkedListElements {
    

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

        //recursive
        if(head == null) return null;
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next:head;
    }
}
      

