public class Question1 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;


        while(curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }


    public static void display(ListNode head) {

        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head = reverse(head);

        display(head);
    }
}