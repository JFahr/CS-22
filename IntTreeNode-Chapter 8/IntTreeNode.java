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

    public void inOrder(IntTreeNode root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }


    public void preOrder(IntTreeNode node)
    {
        if (node==null)
        {
            return;
        }
        System.out.printf("%s ",node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(IntTreeNode root)
    {
        if(root !=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.printf("%d ",root.data);
        }
    }


    public IntTreeNode add(IntTreeNode root, IntTreeNode nodeToBeInserted) 
    {
        if (root == null) {
            root = nodeToBeInserted;
            return root;
        }

        if (root.data > nodeToBeInserted.data) {
            if (root.left == null)
                root.left = nodeToBeInserted;
            else
                add(root.left, nodeToBeInserted);
        } else if (root.data < nodeToBeInserted.data)
            if (root.right == null)
                root.right = nodeToBeInserted;
            else
                add(root.right, nodeToBeInserted);
        return root;
    }

    public IntTreeNode deleteNode(IntTreeNode root, int value)
    {
        if(root==null)
            return null;
        if(root.data>value)
        {
            root.left=deleteNode(root.left, value);
        }
        else if(root.data<value)
        {
            root.right=deleteNode(root.right, value);
        }
        else
        {
            //If node has children
            if(root.left!=null && root.right != null)
            {
                IntTreeNode temp=root;
                IntTreeNode minNodeForRight=minimumElement(temp.right);
                root.data=minNodeForRight.data;
                root.right=deleteNode(root.right, minNodeForRight.data);
            }
            //if theres a left child
            else if(root.left !=null)
            {
                root=root.left;
            }
            else if(root.right!=null)
            {
                root=root.right;
            }
            else
                root=null;
        }
        return root;
    }

        public IntTreeNode minimumElement(IntTreeNode root)
    {
        if (root.left == null)
            return root;
        else {
            return minimumElement(root.left);
        }
    }

    int maxDepth(IntTreeNode node)
        {
            if (node == null)
                return 0;
            else
            {
                /* compute the depth of each subtree */
                int lDepth = maxDepth(node.left);
                int rDepth = maxDepth(node.right);

                /* use the larger one */
                if (lDepth > rDepth)
                    return (lDepth + 1);
                else
                    return (rDepth + 1);
            }
        }
}
