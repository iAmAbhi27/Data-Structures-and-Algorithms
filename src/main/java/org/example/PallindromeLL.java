package org.example;


public class PallindromeLL {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }


    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // 1️⃣ Find middle (slow will point to mid)
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2️⃣ For odd length, skip the middle element
        if (fast != null) slow = slow.next;

        // 3️⃣ Reverse second half
        ListNode secondHalf = reverseList(slow);

        // 4️⃣ Compare both halves
        ListNode firstHalf = head;
        ListNode secondCopy = secondHalf; // To restore later
        boolean isPalin = true;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // 5️⃣ Optional: restore original list
        reverseList(secondCopy);

        return isPalin;
    }

    // Reverse linked list in place
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Helper: build list from array
    public static ListNode buildList(int[] arr) {
        ListNode head = null, tail = null;
        for (int val : arr) {
            ListNode node = new ListNode(val);
            if (head == null) head = node;
            else tail.next = node;
            tail = node;
        }
        return head;
    }

    // ✅ Test
    public static void main(String[] args) {
        int[][] tests = {
                {1, 2, 2, 1},
                {1, 2, 3, 2, 1},
                {1, 2, 3},
                {1},
                {}
        };

        for (int[] arr : tests) {
            ListNode head = buildList(arr);
            System.out.println(java.util.Arrays.toString(arr) + " → " + isPalindrome(head));
        }
    }
}
