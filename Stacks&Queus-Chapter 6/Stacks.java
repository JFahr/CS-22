import java.util.*;
public class Stacks
{
 public static void main(String[] args)
 {
     Stack<Integer> st = new Stack<Integer>(); 
     Random r = new Random();
     Queue<Integer> qu = new LinkedList();//constructing a queue object
     //implementing linkedList
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
        Stack<Integer> tmpStack=SplitStack(st);
        System.out.println("New Stack front "+ tmpStack);
        while(!tmpStack.isEmpty())//checks to see if stack is empty
       {
           qu.add(tmpStack.pop());//takes value in stack and adds it to queue
        }
        System.out.println("Queue " + qu);//prints the queue, which now has values
       rearrange(qu);
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
    
    public static void rearrange(Queue<Integer> list)
    {
     Queue<Integer> que = new LinkedList();
     Queue<Integer> Que = new LinkedList();
        int size=list.size();
        for(int i=0;i<size;i++)
        {
            int number=list.remove();
            if(number%2==0)
            {
                que.add(number);
            }
            else
            Que.add(number);
        }
        while(!Que.isEmpty())
        {
        que.add(Que.poll());
    }
        System.out.println("Rearranged Queue: "+que);
        
    }
}