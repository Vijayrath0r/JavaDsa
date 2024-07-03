package leetcode;

// Implement Stack using Queues
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue1, queue2;

    public MyStack() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        queue1.offer(x);
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
    }

    public int pop() {
        if (!queue1.isEmpty()) {
            return queue1.poll();
        }
        return -1;
    }

    public int top() {
        if (!queue1.isEmpty()) {
            return queue1.peek();
        }
        return -1;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}

public class Question225 {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}
