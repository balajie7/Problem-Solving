package Day7;

import java.util.*;

class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(1);

        System.out.println("PriorityQueue (min-heap order):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(5);
        maxHeap.add(1);

        System.out.println("PriorityQueue (max-heap order):");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
