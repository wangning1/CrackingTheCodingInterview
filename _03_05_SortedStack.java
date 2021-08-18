import java.util.Stack;

public class _03_05_SortedStack {
    private Stack<Integer> stack;
    private Stack<Integer> tmpStack;

    public _03_05_SortedStack() {
        stack = new Stack<>();
        tmpStack = new Stack<>();
    }

    public void push(int val) {
        while (!stack.isEmpty() && stack.peek() < val) {
            tmpStack.push(stack.pop());
        }
        stack.push(val);
        while (!tmpStack.isEmpty()) {
            stack.push(tmpStack.pop());
        }
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }

    public int peek() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return -1;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        _03_05_SortedStack mystack = new _03_05_SortedStack();
        mystack.push(1);
        mystack.push(2);
        System.out.println(mystack.peek());
    }
}
