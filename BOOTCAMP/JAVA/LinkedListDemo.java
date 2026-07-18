public class LinkedListDemo {


    
Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	//printing
	public void print() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.print("null");
	}
	
	//adding at first
	public void addf(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;		
		}
		newNode.next = head;
		head = newNode;
	}
	
	//addlast
	public void addl(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr =curr.next;
		}
		curr.next = newNode;
	}
	
	public void addany(int data, int pos) {
		Node newNode = new Node(data);
		if(pos == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node curr = head;
		int i = 0;
		while(curr!=null && i<pos-1) {
			curr = curr.next;
			i++;
		}
		if(curr == null) {
			System.out.println("pos out of bound");
			return;
		}
		newNode.next = curr.next;
		curr.next = newNode;
	}
	
	//function findmid
	public Node middleNode(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	//length
	public int length() {
		int count=0;
		for(Node curr=head;curr!=null;curr=curr.next)
		{
			count++;
		}return count;
			
	}
	
	public Node getNthnode(Node node,int n) {
		int c=0;
		Node ansNode=null;
		while(node.next!=null) {
			if(c==n) {
				ansNode=node;
				break;
			}
			node=node.next;
			c++;
		}
		return ansNode;
	}
	
	public void last_node(Node head)
	{
		Node temp = head;
		while(temp.next!=null)
		{				
			temp = temp.next;
		}	
		System.out.println(temp.data);
	}
	public Node reverse(Node head)
	{
		Node currNode=head;
		Node prevNode=null;
		Node nextNode=null;
		while(currNode!=null)
		{
			nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
		}
		return prevNode;
	}
	
	
	
	
	
	
	
	
	

public static void main(String[] args) {
 LinkedListDemo list = new LinkedListDemo();
 list.addf(3);
 list.addf(2);
 list.addf(1);
 list.addl(4);
 list.addany(5, 4);
// list.print();
 list.head=list.reverse(list.head);
 list.print();
 
 
 //list.last_node(list.head);
 
 //System.out.prinln
 //System.out.println(list.middleNode(list.head).data);
// System.out.print(list.length());
// System.out.print(list.getNthnode(list.head,2).data);
}
}
