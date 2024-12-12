package Day8;

import java.util.*;

class RemoveDuplicatesFromLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode removeDuplicates(ListNode head) {
        if (head == null) return null;

        Set<Integer> seen = new HashSet<>();
        ListNode current = head;
        seen.add(current.val);

        while (current != null && current.next != null) {
            if (seen.contains(current.next.val)) {
                current.next = current.next.next; // Remove duplicate
            } else {
                seen.add(current.next.val);
                current = current.next;
            }
        }

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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Original list:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
