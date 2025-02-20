package org.example.DataStructure;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void testAddNode() {
        List<Integer> expectedResult = List.of(1, 2, 3, 6, 4, 7, 5);
        Tree tree = new Tree();
        tree.add(1, 0);
        tree.add(2, 1);
        tree.add(3, 2);
        tree.add(4, 2);
        tree.add(5, 1);
        tree.add(6, 3);
        tree.add(7, 4);

        List<Integer> result = tree.printList();

        assertEquals(expectedResult, result);
    }
}