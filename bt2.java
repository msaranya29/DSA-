class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class bt2 {

    // Helper class to store height and diameter together
    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    // Function that returns height and diameter
    static TreeInfo diameter(Node root) {
        // Base case
        if (root == null)
            return new TreeInfo(0, 0);

        // Recursive calls
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        // Current node's height
        int currHeight = 1 + Math.max(left.height, right.height);

        // Diameter passing through current node
        int diameterThroughRoot = left.height + right.height + 1;

        // Overall diameter
        int currDiameter = Math.max(diameterThroughRoot,
                                    Math.max(left.diameter, right.diameter));

        return new TreeInfo(currHeight, currDiameter);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter of the tree is: " + diameter(root).diameter);
    }
}

