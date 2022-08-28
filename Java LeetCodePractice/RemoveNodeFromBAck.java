public class RemoveNodeFromBAck {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        if (head.next == null) {
            if (n == 1)
                return null;
            else
                return head;
        }

        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size += 1;
            temp = temp.next;
        }
        int prevIndex = size - n;
        int delIndex = size - n + 1;
        temp = head;
        ListNode temp2 = head;
        for (int i = 0; i < prevIndex - 1; i++) {
            temp = temp.next;
        }
        for (int i = 0; i < delIndex - 1; i++) {
            temp2 = temp2.next;
        }
        temp.next = temp2.next;

        return head;
    }

    public static void main(String[] args) {

    }
}
