class Node {
  int data;
  Node left, right;

  public Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}

class BinaryTree {
  Node root;
  public Node addRecursion(Node currentNode, int data) {
    if (currentNode == null) {
      return new Node(data);
    }
    
    if (data < currentNode.data) {
      currentNode.left = addRecursion(currentNode.left, data);
    } else if (data > currentNode.data) { // data >= currentNode.data if you want to allow duplicate values in the tree
      currentNode.right = addRecursion(currentNode.right, data);
    }

    return currentNode;
  }
  
  public void add(int data) {
    root = addRecursion(root, data);
  }
  
  public void preOrder(Node root) {
    // if (root == null) {
    //     return;
    // }
    if (root != null) {
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }
  }
  
  public void preOrder() {
    preOrder(root);
  }

}

public class Solution {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.add(7);
    tree.add(3);
    tree.add(9);
    tree.add(4);
    tree.add(2);
    tree.add(4);
    tree.preOrder();
  }
}