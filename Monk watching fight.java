import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
 
 
class BinarySearchTree {
    static class Node{
        int key;
        Node left,right;
        public Node(int item)
        {
            key=item;
            left=right=null;
        }
    }
    static Node root;
    BinarySearchTree(){
        root=null;
    }
    public static void insert(int key)
    {
        root=insertrec(root,key);
    }
    public static Node insertrec(Node root,int key)
    {
        if(root == null)
        {
            root=new Node(key);
            return root;
        }
        if(key <= root.key)
        {
            root.left = insertrec(root.left,key);
        }
        else if(key > root.key)
        {
            root.right = insertrec(root.right,key);
        }
        return root;
    }
    public static int height(Node n)
    {
        if(n == null )
        {
            return 0;
        }else{
            int ldepth = height(n.left);
            int rdepth = height(n.right);
            if(ldepth > rdepth)
            {
                return ldepth + 1;
            }
            else
            {
                return rdepth + 1;
            }
        }
    }
    public static void main(String args[] ) throws Exception {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        BinarySearchTree tree=new BinarySearchTree(); 
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            tree.insert(a);
        }
        System.out.println(tree.height(tree.root));
    }
}
 
 
