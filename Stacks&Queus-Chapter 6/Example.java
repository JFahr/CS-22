import java.util.*;
public class Example
{
 public static void main(String[] args)
 {
     Random r = new Random ();
     Stack<Integer> st = new Stack<>();//constructing a stack object
     Queue<Integer> qu = new LinkedList();//constructing a queue object implementing linkedList
     int a = 1;//loop counter
     while (a<=7)
     {
         //adding values to stack
        st.push(r.nextInt(20));
        st.push(r.nextInt(10) * -1); 
        st.push(r.nextInt(50));
        a++;
        }
        System.out.println("Stack " + st);//prints stack
        while(!st.isEmpty())//checks to see if stack is empty
       {
           qu.add(st.pop());//takes value in stack and adds it to queue
        }
        System.out.println("Queue " + qu);//prints the queue, which now has values
    while(!qu.isEmpty())//check to see if queue is empty
    {
      st.push(qu.remove());  //take value from queue and push onto the stack
    }
}

public static Stack<Integer> SplitStack(Stack<Integer>  
                                             input) 
    { 
        Stack<Integer> tmpStack = new Stack<Integer>(); 
        while(!input.isEmpty()) 
        { 
            int tmp = input.pop(); 
            while(!tmpStack.isEmpty() && tmpStack.peek()  
                                                < tmp) 
            {
                input.push(tmpStack.pop()); 
            }
            tmpStack.push(tmp); 
        } 
        return tmpStack; 
    } 
}