
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return res;

        Queue<Integer> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>level=new ArrayList<>();

            for(int i =0; i<size;i++){
                TreeNode node =q.poll();
                level.add(node.val);
                if(node.left != null)q.offer(node.left);
                if(node.right !=null)q.offer(node.right);

        }
        res.add(level);
        }return res;
        
    }
}