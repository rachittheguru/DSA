import java.util.LinkedList;
import java.util.Queue;

public class sizeofTree {
    static int s=0;
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
        // recursive call
        public static void preorder(Node root) {
            if (root == null) return;
           // s++;
            System.out.print(root.data + " "); 
            preorder(root.left);             
            preorder(root.right);            
        }
        public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
        }
        public static int sum(Node root){
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
        }
        // so find max we will compare the root with left and right and return the max of them 
        public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a= root.data;
        int b=max(root.left);
        int c =max(root.right);
        return Math.max(a,Math.max(b,c));
        }
        
        public static int height(Node root){
        if(root==null)return 0;
        if(root.left ==null|| root.right==null) return 0;
        return 1+Math.max(height(root.right),height(root.left));
        }
        public static int mul(Node root){
        if(root==null)return 1;
        return root.data*mul(root.left)*mul(root.right);
        }
        public static int min(Node root){
        if(root==null)return Integer.MAX_VALUE;
        int d=root.data;
        int e=min(root.left);
        int f =min(root.right);
        return Math.min(d,Math.min(e,f));
        }
        public static void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
        public static void postorder(Node root){
            if(root==null) return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void nthlevel(Node root,int n){
        if(root==null)return;
        if(n==1) System.out.print(root.data+" ");
        nthlevel(root.left,n-1);
        nthlevel(root.right,n-1);
        }

        public static void bfs(Node root){
        //this is not recursion  we can do it with queue
            Queue<Node>q=new LinkedList<>();
            if(root!=null)q.add(root);
            while(q.size()>0){
                Node temp=q.peek();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                System.out.print(temp.data+" ");
                q.remove();
            }
        }




        
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
       // System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println("");
        inorder(root);
        System.out.println(" ");
        postorder(root);
        System.out.println(" ");
        //System.out.print(s);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
        System.out.println(mul(root));
        System.out.println(min(root));
        nthlevel(root,2);
        System.out.println(" ");
        bfs(root);
    }
}