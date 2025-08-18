// Queue implementation using Linked List
public class Queue_LL {
    // Node structure
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class
    static class Queue {
        Node front, rear;

        Queue() {
            this.front = this.rear = null;
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return front == null;
        }

        // Enqueue: add element to the rear
        public void enqueue(int data) {
            Node newNode = new Node(data);

            // If queue is empty
            if (rear == null) {
                front = rear = newNode;
                return;
            }

            // Add new node at the end and update rear
            rear.next = newNode;
            rear = newNode;
        }

        // Dequeue: remove element from the front
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            int value = front.data;
            front = front.next;

            // If queue becomes empty
            if (front == null) {
                rear = null;
            }

            return value;
        }

        // Peek: get front element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return front.data;
        }

        // Display queue elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }

            Node temp = front;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}
