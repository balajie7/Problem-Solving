package Day9;

import java.util.*;

class RootToLeafPaths {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static void findPaths(TreeNode root, List<List<Integer>> paths, List<Integer> currentPath) {
        if (root == null) return;

        currentPath.add(root.val);

        if (root.left == null && root.right == null) {
            paths.add(new ArrayList<>(currentPath));
        } else {
            findPaths(root.left, paths, currentPath);
            findPaths(root.right, paths, currentPath);
        }

        currentPath.remove(currentPath.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<List<Integer>> paths = new ArrayList<>();
        findPaths(root, paths, new ArrayList<>());

        System.out.println("Root-to-Leaf Paths:");
        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }
}
