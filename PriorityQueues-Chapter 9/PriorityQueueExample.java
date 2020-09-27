import java.util.*; 
public class PriorityQueueExample {
   public static void main(String[] args) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();//constructs a priority queue
      PriorityQueue<Integer> qp = new PriorityQueue<>(Collections.reverseOrder());//constructs a priority queue that will remove in reverse order
      Random r = new Random();
      int i = 1;
      while (i <= 10)//loop populates queues
      {
         pq.add(r.nextInt(30));
         qp.add(r.nextInt(30));
         i++;
      }

      System.out.println("Priority queue values are: " + pq.toString());
      pq = removeDuplicate(pq);
      System.out.println("Priority queue values without duplicates are: " + pq.toString());

      int k = r.nextInt(12);
      System.out.println("The " + k + "th smallest element is: " + kthSmallest(pq, k));

   }

   public static PriorityQueue<Integer> removeDuplicate(PriorityQueue<Integer> queue)
   {
      int[] queueArray = new int[queue.size()];
      //size()
      //Returns the number of elements in this collection.
      int i = 0;
      while (!queue.isEmpty())
      {
         int value = queue.remove();
         queueArray[i] = value;
         i++;
      }
      //[0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9]
      for (int j : queueArray) {
         if (!queue.contains(j)) {
            queue.add(j);
         }
      }
      return queue;
   }


   public static int kthSmallest(PriorityQueue<Integer> queue, int k)
      {
         try
         {
            PriorityQueue<Integer> queueCopy = new PriorityQueue<Integer>();
            queueCopy = queue;
            int[] queueArray = new int[queueCopy.size()];
            //size()
            //Returns the number of elements in this collection.
            int i = 0;
            while (!queueCopy.isEmpty()) {
               int value = queueCopy.remove();
               queueArray[i] = value;
               i++;
            }
            Arrays.sort(queueArray);
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j : queueArray) {
               if (!list.contains(j)) {
                  list.add(j);
               }
            }
            //return 3rd smallest
            //[0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9]
            return list.get(k - 1);
            // 0->1->2->3->4->5->6->7->8->9
         }
         catch (IndexOutOfBoundsException ex)
         {
            System.out.println("The element you entered is out of bounds!");
         }
         return -1;
      }
   }
