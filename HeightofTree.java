class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class HeightofTree {
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Height of the tree is: " + height(root));
    }

    // Function to calculate height of binary tree
    public static int height(TreeNode root) {
        if (root == null)
            return 0; // Base case: empty tree has height 0

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Height of current node = 1 + max(left, right)
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
