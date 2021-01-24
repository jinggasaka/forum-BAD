package com.company;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTryExceptions {
    public static void main(String args[]) {
        Stack stack = new Stack();
        try {
            stack.push("1");
            stack.push("2");
            System.out.println(stack.pop().toString());
            stack.push("3");
            stack.push("4");
            stack.push("5");
            stack.push("6");
            stack.push("7");
            stack.push("8");
            stack.push("9");
            stack.push("4");
        } catch (EmptyStackException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Yang ini selalu dijalankan");
        }

    }
}
