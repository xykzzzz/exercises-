package offer;

public class AAA {
    String Serialize(TreeNode root) {
     if(root==null){
         return "";
     }
     StringBuilder sb=new StringBuilder();
      return utilSerialize(root,sb).toString();
    }

    private StringBuilder utilSerialize(TreeNode node, StringBuilder sb) {
        if(node==null){
            return sb;
        }
        sb.append(node.val).append("!");
        if(node.left!=null){
            utilSerialize(node.left,sb);
        }else {
            sb.append("#!");
        }
        if(node.right!=null){
            utilSerialize(node.right,sb);
        }else {
            sb.append("#!");
        }
        return sb;
    }
    private int index=0;
    TreeNode Deserialize(String str) {
        if(str==null || str.length()==0){
            return  null;
        }
        String[] split = str.split("!");
        return utilDeserialize(split);
    }
    //1!2!4!#!#!5!#!#!3!6!#!#!7!#!#!
    //124##5##36##7##
    private TreeNode utilDeserialize(String[] str) {
        if(str[index].equals("#")){
            index++;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(str[index]));
        index++;
        root.left=utilDeserialize(str);
        root.right=utilDeserialize(str);
        return root;
    }
}
