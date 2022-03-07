class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class BinaryTree {
  // Visit the root node, Recursively traverse the left subtree, Recursively traverse the right subtree
  void preOrder(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }
  }
  // Recursively traverse the left subtree, Visit the root node, Recursively traverse the right subtree
  void inOrder(Node root) {
    if (root != null) {
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
    }
  }
  // Recursively traverse the left subtree, Recursively traverse the right subtree, Visit the root node
  void postOrder(Node root) {
    if (root != null) {
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
    }
  }
}

class Solution {
  public static void main(String[] args) {
    Node root = new Node(50);
    root.left = new Node(45);
    root.right = new Node(30);
    root.left.right = new Node(65);
    root.left.right.left = new Node(80);
    root.left.right.left.right = new Node(11);

    BinaryTree tree = new BinaryTree();
    System.out.println("Preorder traversal of binary tree");
    tree.preOrder(root);
    System.out.println();
    System.out.println("Inorder traversal of binary tree");
    tree.inOrder(root);
    System.out.println();
    System.out.println("Postorder traversal of binary tree");
    tree.postOrder(root);
  }
}

/*

      50
  45      30
    65
  80
    11

O/P =>
Preorder traversal of binary tree
50 45 65 80 11 30 
Inorder traversal of binary tree
45 80 11 65 50 30 
Postorder traversal of binary tree
11 80 65 45 30 50 

*/

