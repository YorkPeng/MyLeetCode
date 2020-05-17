import java.util.Stack;

/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int temp = stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }
    
    /** Get the front element. */
    public int peek() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int temp = stack2.peek();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1.empty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

