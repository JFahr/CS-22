import java.util.*;
/**
 * Write a description of class List here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class List
{
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        ListNode front=new ListNode();
        System.out.println("This is what is in the Linked List at the monment: "+front);
        System.out.println("(If -1 is displayed then List Node is empty.)");
        System.out.println();
        System.out.print("Would you like to add a Node? (Y/N) ");
        char answer=input.next().charAt(0);
        System.out.println();
        while(answer=='y' || answer =='Y')
        {
        System.out.print("Enter Node: ");
        int number=input.nextInt();
        System.out.println();
        System.out.print("Would you like to add a Node? (Y/N) ");
        answer=input.next().charAt(0);
        System.out.println();
        front.insertNode(number);
    }
        
        System.out.println("This is your finalized list: ");
        System.out.println(front);
        System.out.println(front.min());
        System.out.println();
        System.out.println(front.max());
    }
}
