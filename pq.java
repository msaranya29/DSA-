import java.util.PriorityQueue;
public class pq {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank; // min heap
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Alice", 3));
        pq.add(new Student("Bob", 1));
        pq.add(new Student("Charlie", 2));
        while(!pq.isEmpty()){
        
            System.out.println(pq.peek().name + " with rank " + pq.peek().rank);
            pq.remove();
        }

    }
}
