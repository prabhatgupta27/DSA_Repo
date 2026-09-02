import com.sun.source.tree.Tree;

public class BinaryTreeMaxDepth {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left  = left;
            this.right = right;
        }
    }

    static int maxDepth(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left,right);
    }

    public static void main(String[] args) {

     /*   TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.left.right = new TreeNode(2);*/

        TreeNode root = new TreeNode(3,
                new TreeNode(9,null,null),
                new TreeNode(20,
                        new TreeNode(15,null,new TreeNode(2)),
                        new TreeNode(7,null,null)));



        System.out.println(maxDepth(root));


    }

}
