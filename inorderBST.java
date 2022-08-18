package com.javadevjournal.datastructure.tree.bst;


public class BinarySearchTree {

    private Node root;
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

  
    private void inOrderTraversal(Node node) {

        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);

            inOrderTraversal(node.right);
        }
    }
   
    class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

            this.left = null;
            this.right = null;
        }
    }
}
