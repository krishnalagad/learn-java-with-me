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
        ListNode head = new ListNode(l1.val + l2.val);
        ListNode rawNode = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sumOfL1 = 0;
            int sumOfL2 = 0;
            int finalSum = 0;

            // for linked list 1
            if (l1 != null)
                sumOfL1 = l1.val;
            else
                sumOfL1 = 0;

            // for linked list 2
            if (l2 != null)
                sumOfL2 = l2.val;
            else
                sumOfL1 = 0;

            finalSum = sumOfL1 + sumOfL2 + carry;
            carry = finalSum / 10; // to get the carry divide sum by 10.
            rawNode = new ListNode(finalSum % 10);
            head.next = rawNode;
            rawNode = rawNode.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return head;
    }
}