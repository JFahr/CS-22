public class IntTreeNode
{
    public int data;//value
    public IntTreeNode left;//left child
    public IntTreeNode right;//right child
    public IntTreeNode(int data)//constructor
    {
     this.data =  data; 
    }
    public void add(int value)//method for adding value
    {
       if(value< data)//is value less than root
       {
          if(left == null)//is left side null
          {
            left =new IntTreeNode(value); //create a new node with value   
          }
          else
          {
            left.add(value);//add node with value (Recursive)
          }
        }
        else{
           if(right == null)
           {
             right = new IntTreeNode(value); 
           }
           else
           {
              right.add(value); //Recursive
           }
        }
    }
    public boolean find(int value)
    {
        if(value == data)//checking root for the value
        {
          return true;//if found return true
        }
        else if(value < data)//if value smaller go left
        {
            if(left == null)
            {
                return false;
            }
            else
            {
                return left.find(value);//(recursive find)
            }
        }
        else
        {
            if(right == null)
            {
                return false;
            }
            else
            {
               return right.find(value);//recursive find
            }
        }
    }
    public void printInOrder()//print in order left - root - right
    {
       if(left != null)//check left child
       {
         left.printInOrder(); //(recursive call) 
       }
       System.out.println(data);
       if(right != null)//check right child
       {
          right.printInOrder(); //recursive call
       }
    }
    public int size(IntTreeNode root)//pass node here
    {
        if(root == null)//check if empty
        {
            return 0;//if empty return 0
        }
        else
        {
            return size(root.left) + size(root.right) + 1;//recursively counting to determine size        
        }
    }
}


