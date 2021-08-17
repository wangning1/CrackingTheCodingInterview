import java.util.Stack;

public class _03_02_MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public _03_02_MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if(minStack.isEmpty()){
            minStack.push(x);
        }else {
            Integer num = minStack.peek();
            if(num < x){
                minStack.push(num);
            }else {
                minStack.push(x);
            }
        }
        stack.push(x);
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
