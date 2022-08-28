class Solution {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode rawNode = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int valOfL1 = 0;
            int valOfL2 = 0;
            int finalSum = 0;

            // for linked list 1
            if (l1 != null) {
                valOfL1 = l1.val;
                // l1 = l1.next;
            } else
                valOfL1 = 0;

            // for linked list 2
            if (l2 != null) {
                valOfL2 = l2.val;
                // l2 = l2.next;
            } else
                valOfL2 = 0;

            finalSum = valOfL1 + valOfL2 + carry;
            carry = finalSum / 10; // to get the carry divide sum by 10.
            rawNode.next = new ListNode(finalSum % 10);
            rawNode = rawNode.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return head.next;
    }
}