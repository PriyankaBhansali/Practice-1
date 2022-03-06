class Node {
  int data;
  Node left, right;

  Node (int data) {
    this.data = data;
    left = right = null;
  }
}

class BinaryTree {
  boolean search(Node root, int x) {
    if (root == null) { // remember to compare root first before checking root.data == x else it with throw NullPointerException
      return false;
    }
    if (root.data == x) {
      return true;
    }
    if (x < root.data) {
      return search(root.left, x);
    } else {
      return search(root.right, x);
    }
  }
}

class Solution {
  public static void main(String[] args) {
    Node root = new Node(9);
    root.left = new Node(7);
    root.left.right = new Node(8);
    root.right = new Node(11);

    BinaryTree tree = new BinaryTree();
    boolean found = tree.search(root, 5);
    System.out.println("Search is " + found);
    System.out.println("Search is " + tree.search(root, 7));
  }
}