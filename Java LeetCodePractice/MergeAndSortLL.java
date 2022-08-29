import java.util.*;

public class MergeAndSortLL {
    public static class ListNode {
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

    public static ListNode createLLOfList(List<Integer> list) {
        ListNode head = new ListNode(0);
        ListNode raw = head;
        for (int i = 0; i < list.size(); i++) {
            raw.next = new ListNode(list.get(i));
            raw = raw.next;
        }

        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for (ListNode node : lists) {
            while (node != null) {
                list.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(list);
        return createLLOfList(list);
    }
}
