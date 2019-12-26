class TreeNode
{
int data;
TreeNode left;
TreeNode right;
TreeNode(int d)
{
data=d;
left=right=null;
}
}
class Tree
{
public static void main(String s[])
{

TreeNode root=new TreeNode(10);
root.left=new TreeNode(20);
root.right=new TreeNode(30);
root.left.left=new TreeNode(40);
}
}
