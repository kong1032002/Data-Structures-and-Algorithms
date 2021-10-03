import java.io.*;
import java.util.*;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

public class Solution {
    public static boolean compareLinkList(SinglyLinkedListNode llist1, SinglyLinkedListNode llist2) {
        while (llist1.next != null && llist2.next != null) {
            if (llist1.data == llist2.data) {
                llist1 = llist1.next;
                llist2 = llist2.next;
            } else {
                return false;
            }
        }
        if ((llist1.next != null && llist2.next == null) || (llist1.next==null && llist2.next !=null)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedListNode llist1 = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode llist2 = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode firstNode1 = new SinglyLinkedListNode(0);
        SinglyLinkedListNode firstNode2 = new SinglyLinkedListNode(0);
        int[] data = new int[10000];
        int q = scanner.nextInt();
        int n, m;
        while (q-- != 0) {
            n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                data[i] = scanner.nextInt();
            }
            for (int i = 0; i <= n; i++) {
                llist1.next = new SinglyLinkedListNode(data[i]);
                llist1 = llist1.next;
                if (i == 0) {
                    firstNode1 = llist1;
                }
            }
            m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                data[i] = scanner.nextInt();
                }
            for (int i = 0; i <= m; i++) {
                llist2.next = new SinglyLinkedListNode(data[i]);
                llist2 = llist2.next;
                if (i == 0) {
                    firstNode2 = llist2;
                }
            }
            System.out.println(((compareLinkList(firstNode1, firstNode2) == true) ? 1 : 0));
        }
    }
}
