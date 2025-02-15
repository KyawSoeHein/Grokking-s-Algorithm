package org.example.DataStructure;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class SinglyLinkedListTest {

    private SinglyLinkedList populateList() {
        final SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        return linkedList;
    }


    @Test
    void testLinkedList() {
        SinglyLinkedList linkedList = populateList();
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> actual = linkedList.printList();

        assertEquals(expected, actual);
    }

    @Test
    void testFindLinkedList() {
        SinglyLinkedList linkedList = populateList();
        int result = linkedList.find(4);
        assertEquals(1, result);
    }

    @Test
    void testFindLinkedListNotFound() {
        SinglyLinkedList linkedList = populateList();
        int result = linkedList.find(8);
        assertEquals(0, result);
    }

    @Test
    void testDoReverse() {
        SinglyLinkedList linkedList = populateList();
        List<Integer> expected = List.of(4, 3, 2, 1);
        linkedList.reverse();
        List<Integer> actual = linkedList.printList();

        assertEquals(expected, actual);
    }
}