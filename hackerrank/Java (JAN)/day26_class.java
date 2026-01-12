// Objective
// Today we're working with Linked Lists. Check out the Tutorial tab for learning materials and an instructional video.
// A Node class is provided for you in the editor. A Node object has an integer data field, , and a Node instance pointer, , pointing to another node (i.e.: the next node in the list).
// A Node insert function is also declared in your editor. It has two parameters: a pointer, , pointing to the first node of a linked list, and an integer, , that must be added to the end of the list as a new Node object.

// Sample Input
// STDIN   Function
// -----   --------
// 4       T = 4
// 2       first data = 2
// 3       second data = 3
// 4       third data = 4
// 1       fourth data = 1

// Sample Output
// 2 3 4 1

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class day26_class {

    public static Node insert(Node head, int data) {
        // Complete this method

        // If the list is empty, return the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the end of the list
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Append the new node
            current.next = newNode;
        }

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}