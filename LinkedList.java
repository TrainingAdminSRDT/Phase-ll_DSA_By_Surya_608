//Merge Two Linked Lists (21)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null)
        return list2;
        else if(list2==null)
        return list1;
        else
        {
            if(list1.val<list2.val)
            {
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;

        }
}
}
//Middle Of Linked List (876)
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        while(b!=null && b.next!=null)
        {
            a=a.next;
            b=b.next.next;
        }
        return a;
    }
}
//Reverse Linked List (206)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode res=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return res;
        
    }
}
//Linked List Cycle (141)
class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
        return false;
        ListNode a=head;
        ListNode b=head;
        while(b!=null && b.next!=null)
        {
            a=a.next;
            b=b.next.next;
            if(a==b)
            return true;
        }
        return false;
    }
}
//Intersection of Two Linked Lists (160)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
        return null;
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b)
        {
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
        return a;
    }
}