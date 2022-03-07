class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class BinaryTree {
  void searchBST(Node root, int x) {
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

  void search(Node root, int x) {
    Node parent = null;
    while (root != null) {
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
      parent = root;
      if (x < root.data) {
        root = root.left;
      } else {
        root = root.right;
      }
    }
    System.out.println("Key not found.");
  }
}

class Solution {
  public static void main(String[] args) {
    Node root = new Node(7);
    root.left = new Node(4);
    root.right = new Node(9);
    root.right.right = new Node(12);

    BinaryTree tree = new BinaryTree();
    tree.searchBST(root, 5);
    tree.searchBST(root, 9);

    tree.search(root, 4);
    tree.search(root, 12);
    tree.search(root, 7);
    tree.search(root, 3);
    tree.search(root, 9);
  }
}