public class Question2 {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;


        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }


        return slow;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);


        System.out.println(middleNode(head).val);
    }
}