package offer;

import java.util.Deque;
import java.util.LinkedList;

public class S {
    private Deque<Integer> stack;
    private Deque<Integer> min;
    public S(){
        stack=new LinkedList<>();
        min=new LinkedList<>();
    }
    public void push(int node) {
        stack.push(node);
        if(min.isEmpty()){
            min.push(node);
        }else {
            int t=min.peek();
            if(node<t){
                min.push(node);
            }else {
                min.push(t);
            }
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
}
