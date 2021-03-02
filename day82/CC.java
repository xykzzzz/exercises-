package fuxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CC {
    public String removeKdigits(String num, int k) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            int n=num.charAt(i)-'0';
            while (stack.size()!=0&&stack.peek()>n&&k>0){
                stack.pop();
                k--;
            }
            if(n!=0||stack.size()!=0){
                stack.push(n);
            }
        }
        while (stack.size()!=0&&k>0){
            stack.pop();
            k--;
        }
        List<Integer> list=new ArrayList<>(stack);
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        if(sb.toString().equals("")){
            sb.append("0");
        }
        return sb.toString();
    }
}
