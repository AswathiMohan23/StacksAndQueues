package com.java;

import java.util.LinkedList;

public class StackAndQueue {
    int stackArray[] = new int[3];
    int pushCount = 0;

    public void push(int data) {
        stackArray[pushCount] = data;
        pushCount++;
    }

    public void display() {
        for (int n : stackArray) {
            System.out.println(n + " ");
        }
    }
    public void peekAndPop(LinkedList<Integer> list) {
        int data;
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\nPeek value : " + list.peek());
            if (list != null) {
                data = list.pop();
                System.out.println("Pop value : " + data);
                System.out.println("list : " + list);
            }
            else if(list==null)
                System.out.println("list is empty");


        }

    }

}

