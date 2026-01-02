package sorting;


import java.util.Random;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
    Node(){}
}

public class MergeSort {
    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node middle = getMiddle(head);
        Node right = middle.next;
        Node left = head;
        middle.next = null;

        return merge(mergeSort(left), mergeSort(right));
    }

    static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node curr = dummy;

        for (; a != null && b != null; curr = curr.next){
            if (a.val <= b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
        }

        curr.next = (a == null) ? b : a;
        return dummy.next;
    }

    static void printList(Node node){
        Node temp = node;

        while(temp != null){
            System.out.print(temp.val +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Random random = new Random();
        Node head = new Node(random.nextInt(100));
        Node node = head;

        for(int i = 0; i < 30; i++){
            node.next = new Node(random.nextInt(100));
            node = node.next;
        }
        head = mergeSort(head);
        System.out.println("Lista Ordenada");
        printList(head);
    }
}



