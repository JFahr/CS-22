import java.io.*;
import java.util.*;
/**
 * Write a description of class PhoneNUmbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneNumbers
{
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(System.in);
        Scanner input=new Scanner(new File("Directory.txt"));
        ArrayList<String>Name=new ArrayList<String>();
        ArrayList<String>Number=new ArrayList<String>();
        while(input.hasNextLine())
        {
            Name.add(input.next());
            Number.add(input.nextLine());
        }
        while(Name.size()<20 && Number.size()<20)
        {
            System.out.println("Enter The Name: ");
            Name.add(scan.next());
            System.out.println("Enter their Phone Number: ");
            Number.add(scan.next());
        }
        String []Array=Name.toArray(new String[Name.size()]);
        String []array=Number.toArray(new String[Number.size()]);
        for(int h=0;h<Array.length;h++)
        {
            String name=Array[h];
            String number=array[h];
            System.out.print((h+1)+".\t"+name+"\t");
            System.out.println(number);
        }
        
    }
}