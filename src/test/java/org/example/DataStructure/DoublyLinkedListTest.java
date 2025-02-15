package org.example.DataStructure;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
    private DoublyLinkedList populateList() {
        final DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtHead(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);

        return linkedList;
    }


    @Test
    void testLinkedList() {
        DoublyLinkedList linkedList = populateList();
        List<Integer> expected = List.of(2, 1, 3, 4);
        List<Integer> actual = linkedList.printList();

        assertEquals(expected, actual);
    }

    @Test
    void testFindLinkedList() {
        DoublyLinkedList linkedList = populateList();
        DoublyLinkedList.Node result = linkedList.find(4);
        assertNotNull(result);
    }

    @Test
    void testFindLinkedListNotFound() {
        DoublyLinkedList linkedList = populateList();
        DoublyLinkedList.Node result = linkedList.find(10);
        assertNull(result);
    }

    @Test
    void testLinkedListReverse() {
        DoublyLinkedList linkedList = populateList();
        linkedList.reverse();
        List<Integer> expected = List.of(4, 3, 1, 2);
        List<Integer> actual = linkedList.printList();

        assertEquals(expected, actual);
    }
}