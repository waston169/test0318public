import java.util.ArrayList;
import java.util.List;

public class preorder0312 {

    public List<Integer> preorder(Node root) {
     List<Integer>  res= new ArrayList<>();
        helper(root,res);
     return res;
    }


   public void helper(Node root,List<Integer> res){
        if(root==null){
            return;
        }else {
            res.add(root.val);
            for (Node trmp:root.children){
                helper(trmp,res);
            }

        }
   }
}
