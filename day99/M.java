package 测树;

public class M {
    public String tree2str(TreeNode t) {
        StringBuilder sb=new StringBuilder();
        preOrder(sb,t);
        return sb.toString();
    }

    private void preOrder(StringBuilder sb, TreeNode t) {
        if(t!=null){
            sb.append(t.val);
            if(t.left==null&&t.right==null){
                return;
            }else if(t.left!=null&&t.right==null){
                sb.append("(");
                preOrder(sb,t.left);
                sb.append(")");
            }else {
                sb.append("(");
                preOrder(sb,t.left);
                sb.append(")");
                sb.append("(");
                preOrder(sb,t.right);
                sb.append(")");
            }
        }
    }
}
