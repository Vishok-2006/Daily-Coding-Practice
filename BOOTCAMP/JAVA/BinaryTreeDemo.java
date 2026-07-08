

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDemo {
	//Node class
	static class Node{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data = data;
			left=right=null;
		}
	}
	
	static int idx = -1;
	public static Node buildTree(int arr[]) {
		idx++;
		if(arr[idx]==-1) {
			return null;
		}
		Node root = new Node(arr[idx]);
		root.left = buildTree(arr);
		root.right = buildTree(arr);
		
		return root;
	}
	//TRAVERSAL
	
	//PREORDER
	public static void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//INRORDER
		public static void inOrder(Node root) {
			if(root == null) {
				return;
			}
			
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	
		//POST ORDER
		public static void postOrder(Node root) {
			if(root == null) {
				return;
			}
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
		
		//LEVEL ORDER
		public static void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();//mt
		q.offer(root);
		q.offer(null);
		
		while(q.size()>0) {
			Node curr = q.peek();
			q.poll();
			 
			if(curr==null) {
				if(!q.isEmpty()) {
					System.out.println();
					q.offer(null);
					continue;
				}else {
					break;
				}
			}
			
			System.out.print(curr.data+" ");
			if(curr.left!=null) {
				q.offer(curr.left);
			}
			if(curr.right!=null) {
				q.offer(curr.right);
			}
		}
		}

	
	public static void main(String args[]) {
	int arr[] = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
    Node root = buildTree(arr);
    levelOrder(root);
    
    
    

} 
}
