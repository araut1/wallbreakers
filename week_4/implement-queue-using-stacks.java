class MyQueue {

    private Stack<Integer> q;
    private Stack<Integer> temp;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {

        q = new Stack<>();
        temp = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        
        while(!q.isEmpty()){
            temp.push(q.pop());
        }
        q.push(x);
        while(!temp.isEmpty()){
            q.push(temp.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {

        if (q.isEmpty()){
            return 0;
        }else {
            return q.pop();
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (q.isEmpty()){
            return 0;
        }else {
            return q.peek();
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {

        return q.isEmpty();
    }
}
