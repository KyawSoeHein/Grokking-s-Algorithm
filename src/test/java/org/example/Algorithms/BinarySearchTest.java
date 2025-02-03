package org.example.Algorithms;

import org.example.Algorithms.Searching.BinarySearch;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void testIfArrayIsEmpty() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        assertThrows(Exception.class, () -> binarySearch.start(0, arrayList));
    }

    @Test
    void testIfArrayIsOne() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(List.of(1));
        int target = 1;

        assertEquals(0, binarySearch.start(target, arrayList));
    }

    @Test
    void testIfArrayIsMultipleOdd() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int target = 3;

        assertEquals(2, binarySearch.start(target, arrayList));
    }

    @Test
    void testIfArrayIsMultipleEven() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        int target = 3;

        assertEquals(2, binarySearch.start(target, arrayList));
    }

    @Test
    void testIfTargetIsFirstItem() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        int target = 1;

        assertEquals(0, binarySearch.start(target, arrayList));
    }

    @Test
    void testIfTargetIsLastItem() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        int target = 6;

        assertEquals(5, binarySearch.start(target, arrayList));
    }
}