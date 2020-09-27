import java.util.*;
public class MainTree
{
    public static void main (String [] args)
    {
        IntTreeNode tree = new IntTreeNode(15);
        Random random = new Random();
        for (int i = 0; i < 10; i++)
        {
            int randomInt = random.nextInt(30);
            tree.add(randomInt);
        }


        System.out.println("This is the Binary Tree in order : ");
        tree.inOrder(tree);
        System.out.println();

        System.out.println("This is the Post Order of the Binary Tree: ");
        tree.postOrder(tree);

        System.out.println();

        System.out.println("This is the Pre Order of the Binary Tree: ");
        tree.preOrder(tree);

        System.out.println();
        System.out.println("This is the height of the Binary Tree is " + tree.maxDepth(tree));
    }
}