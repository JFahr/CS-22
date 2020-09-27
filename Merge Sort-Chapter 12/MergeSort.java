// This program implements the merge sort algorithm for
// arrays of integers.
import java.io.*;
import java.util.*;

public class MergeSort {
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<String> list= new ArrayList<String>();
        
        Scanner input = new Scanner (new File ("names.txt"));
        while(input.hasNextLine())
        {
            list.add(input.nextLine());
        }
        String []Array=list.toArray(new String[list.size()]);
        mergeSort(Array);
        for(String string:Array)
        {
            System.out.println(string);
        }
    }


    // Places the elements of the given array into sorted order
    // using the merge sort algorithm.
    // post: array is in sorted (nondecreasing) order
    public static String[] mergeSort(String[] array) {
        if (array.length > 1) {
            // split array into two halves
            String[] left = leftHalf(array);
            String[] right = rightHalf(array);
            
            // recursively sort the two halves
            mergeSort(left);
            mergeSort(right);
            
            // merge the sorted halves into a sorted whole
            merge(array, left, right);
        }
        return array;
    }
    
    // Returns the first half of the given array.
    public static String[] leftHalf(String[] array) {
        int size1 = array.length / 2;
        String[] left = new String[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }
    
    // Returns the second half of the given array.
    public static String[] rightHalf(String[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        String[] right = new String[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }
    
    // Merges the given left and right arrays into the given 
    // result array.  Second, working version.
    // pre : result is empty; left/right are sorted
    // post: result contains result of merging sorted lists;
    public static void merge(String[] result, 
                             String[] left, String[] right) {
        int i1 = 0;   // index into left array
        int i2 = 0;   // index into right array
        
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && 
                    left[i1].compareTo(right[i2])<=0)) {
                result[i] = left[i1];    // take from left
                i1++;
            } else {
                result[i] = right[i2];   // take from right
                i2++;
            }
        }
    }
 }