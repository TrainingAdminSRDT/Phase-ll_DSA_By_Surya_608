public class Question5 {


    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static ListNode removeNth(ListNode head, int n) {


        ListNode dummy = new ListNode(0);

        dummy.next = head;


        ListNode slow = dummy;
        ListNode fast = dummy;


        for(int i=0;i<=n;i++) {
            fast = fast.next;
        }


        while(fast != null) {

            slow = slow.next;
            fast = fast.next;
        }


        slow.next = slow.next.next;


        return dummy.next;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);


        head = removeNth(head,2);


        while(head != null) {

            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}