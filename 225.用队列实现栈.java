import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }
        int temp = queue1.poll();

        while(!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }

        return temp;
    }
    
    /** Get the top element. */
    public int top() {
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }
        int temp = queue1.peek();

        queue2.add(queue1.poll());

        while(!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
        return temp;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

