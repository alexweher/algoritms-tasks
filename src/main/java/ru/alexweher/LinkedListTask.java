package ru.alexweher;

public class LinkedListTask {


    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }


    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }


    public static int count(ListNode head) {

        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static boolean contains(ListNode head, int x) {

        ListNode current = head;

        while (current != null) {
            if (current.value == x) {
                return true;
            } else {
                current = current.next;

            }
        }
        return false;
    }


    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    public static ListNode middle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
}