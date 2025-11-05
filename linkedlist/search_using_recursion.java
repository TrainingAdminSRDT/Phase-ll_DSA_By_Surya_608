import java.util.*;

public class search_using_recursion {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;

    public void addnode(int data) {
        node ad = new node(data);
        if (head == null) {
            head = tail = ad;
            return;
        }
        tail.next = ad;
        tail = ad;
    }

    // Correct recursive search
    public static boolean searchin(node temp, int key) {
        if (temp == null) {
            return false;
        }
        if (temp.data == key) {
            return true;
        }
        return searchin(temp.next, key);
    }

    public static void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        search_using_recursion sm = new search_using_recursion();
        sm.addnode(1);
        sm.addnode(2);
        sm.addnode(3);
        sm.addnode(4);
        sm.addnode(5);
        sm.addnode(6);
        sm.addnode(7);
        sm.addnode(8);
        sm.addnode(9);

        print();
        System.out.println("Key found = " + searchin(head, 7)); // should return true
        System.out.println("Key found = " + searchin(head, 10)); // should return false
    }
}
