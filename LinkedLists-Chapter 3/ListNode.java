// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class ListNode {
    public int data;//data stored in this node
    public ListNode front;//points to head node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
        public String toString() {
        if (front == null) {
            return "-1";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
    
    //gets the maximum number
    public String max()
    {
        int Max=-300;
        while(front !=null)
        {
            if(Max<front.data)
            {
                Max=front.data;
            }
            front=front.next;
        }
        String max="This is your highest number ["+Max+"]";
        return max;
    }
    //gets the minimum number
    public String min()
    {
        int Min=100;
        while(front !=null)
        {
            if(Min>front.data)
            {
                Min=front.data;
            }
            front=front.next;
        }
        String min="This is your smallest number ["+Min+"]";
        return min;
    }

    // post: appends the given value to the end of the list
    public void insertNode(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }
     // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)   
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }
    
    
     // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    public ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    
    
}