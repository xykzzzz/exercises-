package 测树;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<Character> in=StringToChar(s);
        List<Character> out=new ArrayList<>();
        TreeNode root=buildTree(in,out);
        inorder(root);
    }

    private static void inorder(TreeNode root) {
        if(root!=null){
            inorder(root.left);
            System.out.printf("%c ",root.val);
            inorder(root.right);
        }
    }

    private static TreeNode buildTree(List<Character> in, List<Character> out) {
        if(in.isEmpty()){
            return null;
        }
        char intValue = in.remove(0);
        if(intValue=='#'){
            out.addAll(in);
            return null;
        }
        TreeNode root=new TreeNode(intValue);
        List<Character> rightOut=new ArrayList<>();
        TreeNode left=buildTree(in,rightOut);
        TreeNode right=buildTree(rightOut,out);
        root.left=left;
        root.right=right;
        return root;
    }

    private static List<Character> StringToChar(String s) {
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }
}
