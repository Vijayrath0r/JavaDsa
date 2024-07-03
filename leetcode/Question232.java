package leetcode;

// Implement Queue using Stacks
import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1, stack2;

    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        if (!stack1.isEmpty()) {
            return stack1.pop();
        }
        return -1;
    }

    public int peek() {
        if (!stack1.isEmpty()) {
            return stack1.peek();
        }
        return -1;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}

public class Question232 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(4);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();

        System.out.println(param_2 + " " + param_3 + " " + param_4);
    }
}
