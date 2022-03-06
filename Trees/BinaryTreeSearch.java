class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class BinaryTree {
  void search(Node root, int x) {
    while (root != null) {
      if (root.data == x) {
        System.out.println("Search Found");
        return;
      }
      if (x < root.data) {
        root = root.left;
      } else {
        root = root.right;
      }
    }
    System.out.println("Not Found");
  }
}

class Solution {
  public static void main(String[] args) {
    Node root = new Node(7);
    root.left = new Node(4);
    root.right = new Node(9);
    root.right.right = new Node(12);

    BinaryTree tree = new BinaryTree();
    tree.search(root, 5);
    tree.search(root, 9);
  }
}