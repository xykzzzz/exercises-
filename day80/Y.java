package fuxi;


import java.util.Deque;
import java.util.LinkedList;

public class Y {
    public int evalRPN(String[] tokens) {
        Deque<String> stack=new LinkedList<>();
        for (String s:tokens) {
            switch (s){
                case "+":
                case "-":
                case "*":
                case "/":{
                    int num=Integer.parseInt(stack.pop());
                    if ("+".equals(s)) {
                        num = Integer.parseInt(stack.pop()) + num;
                    } else if ("-".equals(s)) {
                        num = Integer.parseInt(stack.pop()) - num;
                    } else if ("*".equals(s)) {
                        num = Integer.parseInt(stack.pop()) * num;
                    } else if ("/".equals(s)) {
                        num = Integer.parseInt(stack.pop()) / num;
                    }
                    stack.push(String.valueOf(num));
                }
                break;
                default:
                    stack.push(s);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
