Class Solution {
    public List<Integer> boundaryTraversal(TreeNode root){
        List<Integer>res = new ArrayList<>();
        if(root == null)return res;
        if(!isLeaf(root))res.add(root.val);
        leftBoundary(root, res);
        addLeaf(root, res);
        addRight(root, res);
        return res;

        
    }
    private boolean isLeaf(TreeNode  root){
        return root.left==null && root.right== null; 
    }

    private void leftBoundary(TreeNode root, List<Integer>res){
        root=root.left;
        while(root != null){
            if(!isLeaf(root)) res.add(root.val);

            if(root.left != null){
                root=root.left;
            }else{
                root=root.right;
            }
        }
    }
    private void  addLeaf(TreeNode root , List<Integer>res){
        if(root == null )return ;
        if(isLeaf(node)){
            res.add(root.val);
            return ;
        }
        addLeaf(root.left, res);
        addLeaf(root.right, res);


    }
    private void addRight(TreeNode root , List<Integer>res ){
        root=root.right;
        List<Integer>temp = new ArrayList<>();
        while(root!= null){
            if(isLeaf(root))temp.add(root.val);

            if(root.right != null){
                root=root.right;

            }else{
                root=root.left;
            }
        }
        for(int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }
}