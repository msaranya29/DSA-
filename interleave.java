import java.util.*;

public class interleave {
    public static void interleaveQueue(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            System.out.println("Queue has odd number of elements, interleaving not perfect!");
        }

        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        // Store first half
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        // Interleave elements
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);   // Works best with even number of elements

        interleaveQueue(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
