package org.example.DataStructure.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {
    @Test
    void testIfHashTableIsWorking() {
        String firstInput = "Kyaw";
        String secondInput = "Soe";
        String thirdInput = "Hein";

        HashTable hashTable = new HashTable();
        hashTable.insert("1", firstInput);
        hashTable.insert("2", secondInput);
        hashTable.insert("3", thirdInput);

        assertEquals(firstInput, hashTable.get("1"));
        assertEquals(secondInput, hashTable.get("2"));
        assertEquals(thirdInput, hashTable.get("3"));
    }

    @Test
    void testIfHashTableDuplicateEntry() {
        String firstInput = "Kyaw";
        String secondInput = "Soe";

        HashTable hashTable = new HashTable();
        hashTable.insert("1", firstInput);
        hashTable.insert("1", secondInput);

        assertEquals(secondInput, hashTable.get("1"));
    }
}