//https://www.geeksforgeeks.org/problems/root-to-leaf-paths-sum/1

class Solution {
    public static int treePathsSum(Node root) {
        // add code here.
        return treePathsSumHelper(root, 0);
    }

    private static int treePathsSumHelper(Node node, int val) {
        
        if (node == null) {
            return 0;
        }

        val = val * 10 + node.data;

        if (node.left == null && node.right == null) {
            return val;
        }
        return treePathsSumHelper(node.left, val) + treePathsSumHelper(node.right, val);
    }
}
