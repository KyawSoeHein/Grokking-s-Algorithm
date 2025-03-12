package org.example.DataStructure.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void testBinarySearchTree() {
        List<Integer> expected = List.of(1, 20, 50, 60, 100, 140);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(1);
        binarySearchTree.insert(100);
        binarySearchTree.insert(60);
        binarySearchTree.insert(140);
        binarySearchTree.insert(50);
        binarySearchTree.insert(20);

        List<Integer> actual = binarySearchTree.printTree();
        assertEquals(expected, actual);
    }

}