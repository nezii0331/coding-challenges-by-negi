//Objective
//day22: Binary Search Trees
// Today, we're working with Binary Search Trees (BSTs). Check out the Tutorial tab for learning materials and an instructional video!

// Task
// The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. You are given a pointer, , pointing to the root of a binary search tree. Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.

// Input Format

import java.util.*;
import java.io.*;

class Node {
  Node left, right;
  int data;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class Solution {

  public static int getHeight(Node root) {
    // Write your code here
    int ans = 0;

    if (root == null) {
      return -1; // this is to set the boundary
    }

    // System.out.println("Enter node: " + root.data);

    int left = getHeight(root.left);
    int right = getHeight(root.right);
    // System.out.println("1. each left :" + left);
    // System.out.println("2. each right :" + right);
    ans = Math.max(left, right) + 1;
    // System.out.println("current ans :" + ans);
    // when this recall it will need to add this level
    // System.out.println(
    // "At node " + root.data +
    // " | left=" + left +
    // " right=" + right
    // );

    return ans;
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
    int height = getHeight(root);
    System.out.println(height);
  }
}
