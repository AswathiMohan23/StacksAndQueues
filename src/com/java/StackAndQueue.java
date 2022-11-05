package com.java;

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

}

