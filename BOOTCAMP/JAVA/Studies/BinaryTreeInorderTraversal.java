package Studies;
import java.util.*;

 // Definition for a binary tree node.
 public class BinaryTreeInorderTraversal {
     int val;
    BinaryTreeInorderTraversal left;
     BinaryTreeInorderTraversal right;
      BinaryTreeInorderTraversal() {}
      BinaryTreeInorderTraversal(int val) { this.val = val; }
      BinaryTreeInorderTraversal(int val, BinaryTreeInorderTraversal left, BinaryTreeInorderTraversal right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
 


class Solution {
    public List<Integer> inorderTraversal(BinaryTreeInorderTraversal root) {
       List<Integer> l=new LinkedList<>();
        trav(root,l);
        return l;
    }
    public static void trav(BinaryTreeInorderTraversal root,List<Integer> l ){
        if(root==null){
            return ;

        }
        trav(root.left,l);
        l.add(root.val);
        trav(root.right,l);
    }
}
