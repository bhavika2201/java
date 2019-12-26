import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(){
        //heyaa
    }
    Node(int d)
    {
        data=d;
        left=right=null;
    }
    Node insert(Node root,int d)
    {
        if(root==null)
        {
            root=new Node(d);
            return root;
        }
        if(root.data>d)
        {
            root.left=insert(root.left,d);
        }
        else
        {
          root.right=insert(root.right,d);
        }
        return root;
    }
    void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
class Bst
{
    public static void main(String s[])
    {
        Node root=null;
       Node obj=new Node();

      root=obj.insert(root,10);
    root=obj.insert(root,20);
root=obj.insert(root,30);
obj.inorder(root);
    }
}