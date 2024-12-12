package Day9;

class SumOfTreeElements {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static int sumTreeElements(TreeNode root) {
        if (root == null) return 0;
        return root.val + sumTreeElements(root.left) + sumTreeElements(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int sum = sumTreeElements(root);
        System.out.println("Sum of all elements in the tree: " + sum);
    }
}
