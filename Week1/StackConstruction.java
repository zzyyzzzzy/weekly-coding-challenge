package Week1;

import java.util.LinkedList;

public class StackConstruction {
    LinkedList<Integer> stack;
    LinkedList<Integer> maxHistory;
    StackConstruction(){
        stack = new LinkedList<>();
        maxHistory = new LinkedList<>();
    }
    public void push(Integer x){
        if(maxHistory.isEmpty()) {
            maxHistory.add(x);
        }else{
            if(maxHistory.peekLast() <= x){
                maxHistory.add(x);
            }
        }
        stack.add(x);
    }
    public int pop(){
        if(stack.isEmpty()){
            throw new RuntimeException();
        }
        int removedElement = stack.removeLast();
        if(removedElement == maxHistory.peekLast()){
            maxHistory.removeLast();
        }
        return removedElement;
    }
    public int max(){
        if(stack.isEmpty()){
            throw new RuntimeException();
        }
        return maxHistory.peekLast();
    }

    @Override
    public String toString() {
        return "StackConstruction{" +
                "stack=" + stack +
                '}';
    }

    public static void main(String[] args) {
        StackConstruction stack = new StackConstruction();
        stack.push(1);
        stack.push(8);
        stack.push(8);
        stack.push(2);
        stack.push(22);
        stack.push(3);
        System.out.println("stack before pop: " + stack);
        System.out.println("pop one element: " + stack.pop());
        System.out.println("stack after pop: " + stack);
        System.out.println("stack max: " + stack.max());
        System.out.println("pop one element: " + stack.pop());
        System.out.println("stack after pop: " + stack);
        System.out.println("stack max: " + stack.max());
        System.out.println("stack max hist: " + stack.maxHistory);
        stack.push(32);
        System.out.println("stack after push 32: " + stack);
        System.out.println("stack max: " + stack.max());
    }
}
