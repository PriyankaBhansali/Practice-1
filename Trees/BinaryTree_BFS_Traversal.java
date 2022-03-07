import java.io.*;
import java.util.*;

class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class BinaryTree {
  // Level-order traversal - visits all the levels of the tree starting from the root, and from left to right.
  void traverseLevelOrder(Node root) {
    if (root == null) {
      return;
    }
    Queue<Node> nodes = new LinkedList<>();
    nodes.add(root);

    while (!nodes.isEmpty()) {
      Node node = nodes.remove();
      System.out.print(node.data + " ");

      if (node.left != null) {
        nodes.add(node.left);
      }

      if (node.right != null) {
        nodes.add(node.right);
      }
    }
  }
}

class Solution {
  public static void main(String[] args) {
    Node root = new Node(50);
    root.left = new Node(45);
    root.right = new Node(30);
    root.right.right = new Node(25);
    root.left.right = new Node(65);
    root.left.right.left = new Node(80);
    root.left.right.left.right = new Node(11);

    BinaryTree tree = new BinaryTree();
    System.out.println("BFS traversal of binary tree");
    tree.traverseLevelOrder(root);
  }
}

/*

      50
  45      30
    65      25
  80
    11

O/P =>
BFS traversal of binary tree
50 45 30 65 25 80 11 

*/

