package Day9;

class BSTToSortedLinkedList {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private static ListNode prev = null;

    public static ListNode convertBSTToSortedList(TreeNode root) {
        if (root == null) return null;

        ListNode head = convertBSTToSortedList(root.left);

        if (prev == null) {
            prev = new ListNode(root.val);
            head = prev;
        } else {
            prev.next = new ListNode(root.val);
            prev = prev.next;
        }

        convertBSTToSortedList(root.right);

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        ListNode sortedList = convertBSTToSortedList(root);
        System.out.println("Sorted Linked List:");
        printList(sortedList);
    }
}
