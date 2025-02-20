package org.example.DataStructure.linkedList;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList {
    private Node root = null;
    private static class Node{
        int value = 0;
        Node next = null;

        public Node (int newValue) {
            this.value = newValue;
            this.next = null;
        }
    }

    public void add(int newValue) {
        Node newNode = new Node(newValue);
        if (root == null) {
            root = newNode;
        } else {
            Node lastNode = traverseToLastNode();
            lastNode.next = newNode;
        }
    }

    private Node traverseToLastNode() {
        Node current = root;
        while (current.next != null) {
            current = current.next;
        }

        return current;
    }

    public List<Integer> printList() {
        List<Integer> result = new ArrayList<>();
        Node current = root;

        if (current.value != 0) {
            result.add(current.value);
        }

        while (current.next != null) {
            current = current.next;
            result.add(current.value);
        }

        return result;
    }

    public int find(int target) {
        Node current = root;

        if (current.value == target) {
            return 1;
        }

        while (current.next != null) {
            current = current.next;
            if (current.value == target) {
                return 1;
            }
        }

        return 0;
    }

    public void reverse() {
        Node previous = null, current = root, next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        root = previous;
    }
}
