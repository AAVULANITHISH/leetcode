class MyQueue {
    Stack<Integer> stack = new Stack<>();
    
    public MyQueue() {
        stack = new Stack<>();
    }
    
    // Push element onto the stack
    public void push(int x) {
        stack.push(x);
    }
    
    // Pop element from the front of the queue
    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop()); // Reverse the order
        }
        int removed = temp.pop(); // Remove the front element
        while (!temp.isEmpty()) {
            stack.push(temp.pop()); // Restore the stack
        }
        return removed;
    }
    
    // Get the front element
    public int peek() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop()); // Reverse the order
        }
        int peek = temp.peek(); // Get the front element
        while (!temp.isEmpty()) {
            stack.push(temp.pop()); // Restore the stack
        }
        return peek;
    }
    
    // Check if queue is empty
    public boolean empty() {
        return stack.isEmpty();
    }
}