class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class BinaryTree {
  Node root;

  void add(int data) {
    Node node = new Node(data);

    if (root == null) {
      root = node;
    } else {
      Node currentNode = root;
      Node prev = null;

      while (currentNode != null) {
        prev = currentNode;
        if (data < currentNode.data) {
          currentNode = currentNode.left;
        } else {
          currentNode = currentNode.right;
        }
      }

      if (data < prev.data) {
        prev.left = node;
      } else {
        prev.right = node;
      }
    }
  }

  void preOrder(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  void preOrder() {
    preOrder(root);
  }
}

public class Solution {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.add(7);
    tree.add(4);
    tree.add(9);
    tree.add(2);
    tree.add(3);
    tree.preOrder();
  }
}