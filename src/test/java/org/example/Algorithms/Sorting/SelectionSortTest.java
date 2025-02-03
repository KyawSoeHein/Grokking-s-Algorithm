package org.example.Algorithms.Sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    final private SelectionSort selectionSort = new SelectionSort();

    @Test
    void testIfArrayIsEmpty() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        assertThrows(Exception.class, () -> selectionSort.start(arrayList));
    }

    @Test
    void testIfSortedProperly() throws Exception{
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(3, 10, 1, 4, 2, 100, 1));
        ArrayList<Integer> expectedList = new ArrayList<>(List.of(1, 1, 2, 3, 4, 10, 100));

        assertEquals(expectedList, selectionSort.start(arrayList));
    }

}