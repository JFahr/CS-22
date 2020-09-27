import java.util.*; 
public class PriorityQueueExample {
public static void main(String[] args) {
PriorityQueue<Integer> pq = new PriorityQueue<>();//constructs a priority queue
PriorityQueue<Integer> qp = new PriorityQueue<>(Collections.reverseOrder());//constructs a priority queue that will remove in reverse order
Random r = new Random();
int i = 1;
while(i<=10)//loop populates queues
{
   pq.add(r.nextInt(30));
   qp.add(r.nextInt(30));
   i++;
}
System.out.println(pq.toString());//prints string representation of queue
System.out.println(qp.toString());
System.out.println(pq.peek());//returns the minimum element in queue
System.out.println(qp.peek());//returns the minimum element which would be the largest since constructed in reverse order
System.out.println(pq.size());//returns number of elements in queue
while(!pq.isEmpty())//traverses queues until empty
{
System.out.println("PQ:" + pq.remove());//removes and returns minimum element
System.out.println("QP:" + qp.remove());//removes and returns minimum element in reverse order
}
}
}