/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package DSA;

public class ArrayStack {
    private final int capacity;
    private final int[] stack;
    private int top;
    
    public ArrayStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isStackFull() {
        return top == capacity - 1;
    }
    
    public int getStackSize() {
        return top + 1;
    }
    
    public void push(int item) {
        if (!isStackFull()) {
            stack[++top] = item;
        } else {
            System.out.println("Stack is full!");
        }
    }
    
    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }
    
    public int top() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }
    
    public void reset() {
        top = -1;
    }
    
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        
        stack.push(15);
        stack.push(25);
        stack.push(35);
        
        stack.printStack();
        System.out.println("Current size: " + stack.getStackSize());
        System.out.println("Top element: " + stack.top());
        
        System.out.println("Popped: " + stack.pop());
        stack.printStack();
        
        stack.push(45);
        stack.push(55);
        stack.push(65); 
        
        stack.printStack();
        System.out.println("Is stack full? " + stack.isStackFull());
        
        stack.reset();
        System.out.println("After reset - Is stack empty? " + stack.isEmpty());
    }
}