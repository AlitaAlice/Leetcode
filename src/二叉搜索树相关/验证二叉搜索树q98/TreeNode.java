package 二叉搜索树相关.验证二叉搜索树q98;

import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates
 *
 * @author Alita Alice
 * @version 1.0
 * @Date: Created in 22:01 2020/5/25
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 *
 * 输入:
 *     2
 *    / \
 *   1   3
 * 输出: true
 * 示例 2:
 *
 * 输入:
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x)
    {
        val=x;
    }

}
class Soulution
{
   List<Integer> rs=new ArrayList<>();

    /**
     * 递归的中序遍历    left data right
     * @param root
     * @return list
     */
   private List<Integer> ldr(TreeNode root) {
       if (root == null) {
           return rs;
       }
       /**
        * 递归中序遍历
        */
       ldr(root.left);
       rs.add(root.val);
       ldr(root.right);
       return rs;
   }

    /**
     * 判断是否为二叉搜索树
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root)
    {
        ldr(root);
        if(rs.size()<2)
        {
            return  true;
        }
        int a = rs.get(0);
        for (int i=1;i<rs.size();i++)
        {
            if(rs.get(i)<=a)
            {
                return false;
            }
            a = rs.get(i);
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(4);
        root.left=n1;
        root.right=n2;
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(6);
        n2.left=n3;
        n2.right = n4;
        System.out.println(new Soulution().isValidBST(root));
    }


}
