public class Question4 {


    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static ListNode merge(ListNode l1, ListNode l2) {


        ListNode dummy = new ListNode(-1);

        ListNode temp = dummy;


        while(l1 != null && l2 != null) {


            if(l1.val < l2.val) {

                temp.next = l1;
                l1 = l1.next;
            }
            else {

                temp.next = l2;
                l2 = l2.next;
            }


            temp = temp.next;
        }


        if(l1 != null)
            temp.next = l1;


        if(l2 != null)
            temp.next = l2;


        return dummy.next;
    }


    public static void display(ListNode head) {

        while(head != null) {

            System.out.print(head.val + " ");
            head = head.next;
        }
    }


    public static void main(String[] args) {


        ListNode a = new ListNode(1);
        a.next = new ListNode(3);


        ListNode b = new ListNode(2);
        b.next = new ListNode(4);


        display(merge(a,b));
    }
}