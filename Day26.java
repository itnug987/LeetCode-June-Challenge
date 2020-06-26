/**
	Problem: Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

Note: A leaf is a node with no children.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
class Solution {
    public int sumNumbers(TreeNode root) {
        
        return treePathsSumUtil(root, 0); 
        
    }
    
    public int treePathsSumUtil(TreeNode node, int val)  
    { 
        // Base case 
        if (node == null) 
            return 0; 
   
        // Update val 
        val = (val * 10 + node.val); 
   
        // if current node is leaf, return the current value of val 
        if (node.left == null && node.right == null) 
            return val; 
   
        // recur sum of values for left and right subtree 
        return treePathsSumUtil(node.left, val) 
                + treePathsSumUtil(node.right, val); 
    } 
    
}