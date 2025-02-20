package org.example.DataStructure;

import org.example.DataStructure.queue.Queue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void testIfQueueAddIsOk() {
        ArrayList<Integer> expectedResult = new ArrayList<>(List.of(3, 4, 5));

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        List<Integer> actualResult = queue.getQueue();

        assertEquals(expectedResult, actualResult);
    }
}