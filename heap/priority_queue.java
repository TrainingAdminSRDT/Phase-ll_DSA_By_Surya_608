import java.util.PriorityQueue;
public class priority_queue {
    static class Student implements Comparable<Student>
    {
        String name;
        int rank;
       public Student(String name,int rank)
        {
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2)
        {
            return this.name.charAt(0) - s2.name.charAt(0);
            // if you want to compare on the basis of rank just "return this.rank - s2.rank;"
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student>pq=new PriorityQueue<>();
        pq.add(new Student("vaibhav", 1));
        pq.add(new Student("ram", 2));
        pq.add(new Student("shaym", 14));
         pq.add(new Student("sagar", 4));
          pq.add(new Student("kk", 67));
           pq.add(new Student("manon", 7));
            pq.add(new Student("sachin", 10));
            while(!pq.isEmpty())
            {
                System.out.println(pq.peek().name+"--->"+pq.peek().rank);
                pq.remove();
            }
            System.out.println();
    }
}
