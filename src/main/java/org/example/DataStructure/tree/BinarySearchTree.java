package org.example.DataStructure.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    Node root = null;

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int newData) {
            data = newData;
            left = null;
            right = null;
        }
    }

    public void insert(int newValue) {
        root = insertRecursive(newValue, root);
    }

    private Node insertRecursive(int newValue, Node parent) {
        if (null == parent) {
            return new Node(newValue);
        }

        if (newValue == parent.data) {
            System.out.println("Duplicate data is not accepted");
            return parent;
        }

        if (newValue < parent.data) {
            parent.left = insertRecursive(newValue, parent.left);
        } else {
            parent.right = insertRecursive(newValue, parent.right);
        }

        return parent;
    }

    private void inOrderTraversalRecursive(Node node, List<Integer> result) {
        if (null != node) {
            inOrderTraversalRecursive(node.left, result);
            result.add(node.data);
            inOrderTraversalRecursive(node.right, result);
        }
    }

    public List<Integer> printTree() {
        List<Integer> result = new ArrayList<>();
        inOrderTraversalRecursive(root, result);
        return result;
    }
}
