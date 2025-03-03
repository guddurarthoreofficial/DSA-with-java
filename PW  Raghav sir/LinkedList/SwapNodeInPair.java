import org.w3c.dom.Node;

public class SwapNodeInPair {

    public static class ListNode {
        int data;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.data = data;
        }

        ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            int length = 0;

            while (fast != null) {
                // swap
                int temp = slow.data;
                slow = head.next;
                fast = head.next.next;
            }

            return head;
        }
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(swapPairs(a).ata);

    }
}
