package linkedlist;

import linkedlist.creatinglinkedlist.LinkedList;
import linkedlist.creatinglinkedlist.Node;

import java.util.HashSet;

public class RemoveDups {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.traversalLL();
        System.out.println("\nAfter deleting");
        removeDups(ll);
        ll.traversalLL();
    }

    public static void removeDups(LinkedList list) {
        HashSet<Integer> hs = new HashSet<>();
        Node current = list.head;
        Node prev = null;
        while (current != null) {
            int curval = current.value;
            if (hs.contains(curval)) {
                prev.next = current.next;
                list.size--;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }
}
