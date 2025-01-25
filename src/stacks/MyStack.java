package stacks;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

//here we will create a stack class using single linked list
public class MyStack<T> {
    private LinkedList<T> stack;

    public MyStack(LinkedList<T> stack) {
        this.stack = stack;
    }

    public MyStack() {
        stack = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public T push(T t) {
        stack.add(t);
        return t;
    }

    public T pop() {
        if (stack.isEmpty())
            throw new EmptyStackException();
        T t = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return t;
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public boolean find(T t) {
        return stack.contains(t);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char openFirstBracket = '(';
        char openSecondBracket = '{';
        char openThirdBracket = '[';
        char closeFirstBracket = ')';
        char closeSecondBracket = '}';
        char closeThirdBracket = ']';
        System.out.println("Please enter a string of valid open and close parenthesis");
        String parenthesis = scanner.next();
        MyStack<Character> characters = new MyStack<>();
        for (char bracketCharacter : parenthesis.toCharArray()) {
            if (characters.isEmpty()) {
                characters.push(bracketCharacter);
            } else {
                //
                if (bracketCharacter == openFirstBracket || bracketCharacter == openSecondBracket || bracketCharacter == openThirdBracket) {
                    characters.push(bracketCharacter);
                } else if (bracketCharacter == closeFirstBracket || bracketCharacter == closeSecondBracket || bracketCharacter == closeThirdBracket) {
                    if (characters.isEmpty()) {
                        throw new RuntimeException("Invalid brackets ... ");
                    }
                    Character lastBracket = characters.pop();
                    if ((lastBracket == openFirstBracket && bracketCharacter == closeFirstBracket) || (lastBracket == openSecondBracket && bracketCharacter == closeSecondBracket) || (lastBracket == openThirdBracket && bracketCharacter == closeThirdBracket))
                        continue;
                    else
                        throw new RuntimeException("Invalid brackets..");
                } else {
                    throw new RuntimeException("Invalid characters valid characters are (,{,[,),},]");
                }
            }

        }
        if (characters.isEmpty())
            System.out.println("Valid bracket ....");
        else
            throw new RuntimeException("Invalid brackets..");
    }

}

