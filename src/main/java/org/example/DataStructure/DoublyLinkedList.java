package org.example.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList {
    private Node head = null;
    private Node tail = null;
    int size = 0;

    public static class Node {
        int value = 0;
        Node next = null;
        Node previous = null;

        public Node (int newValue) {
            this.value = newValue;
            this.next = null;
            this.previous = null;
        }
    }

    public void addAtHead(int newValue) {
        Node newNode = new Node(newValue);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    public void addAtTail(int newValue) {
        Node newNode = new Node(newValue);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node find(int targetValue) {
        Node current = head;

        while (current != null) {
            if (current.value == targetValue) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public void reverse() {
        Node current = head;
        while (current != null) {
            Node temp = current.next;
            current.next = current.previous;
            current.previous = temp;
            current = current.previous;
        }

        Node temp1 = head;
        head = tail;
        tail = temp1;
    }

    public List<Integer> printList() {
        List<Integer> result = new ArrayList<>();
        Node current = head;

        while (current != null) {
            result.add(current.value);
            current = current.next;
        }

        return result;
    }
}
