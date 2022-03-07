class Node {
  int data;
  Node left, right;

  Node (int data) {
    this.data = data;
    left = right = null;
  }
}

class BinaryTree {
  boolean searchBST(Node root, int x) {
    if (root == null) { // remember to compare root first before checking root.data == x else it with throw NullPointerException
      return false;
    }
    if (root.data == x) {
      return true;
    }
    if (x < root.data) {
      return searchBST(root.left, x);
    } else {
      return searchBST(root.right, x);
    }
  }

  // Given a BST, write an efficient function to search a given key in it.
  // The algorithm should return the parent node of the key and print if the key is the left or right node of the parent node.
  // If the key is not present in the BST, the algorithm should be able to determine that.
  void search(Node root, int x, Node parent) {
    if (root == null) {
      System.out.println("Key not found.");
      return;
    }
    if (root.data == x) {
      if (parent == null) {
        System.out.println("The node with key " + x + " is root node.");
        return;
      }
      if (x < parent.data) { // this is parent.data and not root.data -> root data and data are equal so needs to be compared to the parent
        System.out.println("Key is at LEFT node of tree with parent node = " + parent.data);
      } else {
        System.out.println("Key is at RIGHT node of tree with parent node = " + parent.data);
      }
      return;
    }
    if (x < root.data) {
      search(root.left, x, root);
    } else {
      search(root.right, x, root);
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
    boolean found = tree.searchBST(root, 5);
    System.out.println("Search is " + found);
    System.out.println("Search is " + tree.searchBST(root, 7));

    tree.search(root, 11, null);
    tree.search(root, 8, null);
    tree.search(root, 10, null);
    tree.search(root, 9, null);
    tree.search(root, 7, null);
  }
}