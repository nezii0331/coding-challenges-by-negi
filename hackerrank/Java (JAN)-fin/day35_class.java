// ask
// A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, top to bottom. You are given a pointer, root, pointing to the root of a binary search tree. Complete the levelOrder function provided in your editor so that it prints the level-order traversal of the binary search tree.

// Hint: You'll find a queue helpful in completing this challenge.

import java.io.*;
import java.util.*;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class day35_class {

    static void levelOrder(Node root) {
        // Write your code here
        if (root != null) {
            Queue<Node> tem = new LinkedList<>(); // to put final answer

            // first put the node that already create into my final answer
            tem.add(root);

            // second i use while loop to check whether this root is empty or not
            while (!tem.isEmpty()) {
                Node current; // for tempar pointer inorder to print ans
                current = tem.poll(); // let current run into the tem tree
                // i should let tem to run and then next layer's data for sure
                // third check left and then right
                if (current.left != null) {
                    tem.add(current.left);
                }

                if (current.right != null) {
                    tem.add(current.right);
                }
                System.out.print(current.data + " ");
            }
        }

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
