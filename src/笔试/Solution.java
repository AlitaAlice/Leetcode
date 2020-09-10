package 笔试;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}



 public class Solution {
    public  List<TreeNode> generateTrees(int n) {

        List<TreeNode>ans = new ArrayList();
        if(n <= 0) return ans;
        if(n == 1)
        {
            ans.add(new TreeNode(1));
            return ans;
        }
        List<TreeNode> list = generateTrees(n-1);
        Iterator<TreeNode> iterator = list.iterator();
        while(iterator.hasNext())
        {
            TreeNode node = iterator.next();
            TreeNode p = node;
            int count = 0;
            while(p != null){p = p.right;count++;}

            TreeNode n1 = new TreeNode(n);
            n1.left = deepClone(node);
            ans.add(n1);
            for(int i = 0;i < count;i++){
                TreeNode head = deepClone(node),nn = head;
                for(int j = 0;j < i;j++)
                    nn = nn.right;
                TreeNode nn1 = new TreeNode(n);
                nn1.left = nn.right;
                nn.right = nn1;
                ans.add(head);
            }
        }
        return ans;
    }

    TreeNode deepClone(TreeNode root)
    {
        if(root == null)return null;
        TreeNode nn = new TreeNode(root.val);
        nn.left = deepClone(root.left);
        nn.right = deepClone(root.right);
        return nn;
    }

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n =scanner.nextInt();
         Solution solution = new Solution();
         System.out.println(solution.generateTrees(n).toArray().length);

     }
}
