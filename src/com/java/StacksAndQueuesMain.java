package com.java;

// UC1 ==> Ability to create a Stack of 56->30->70 Use LinkedList to do the Stack Operations.Here push will internally
// call add method on LinkedList.So 70 will be added first then 30 and then 56 to make 56 on top of the Stack

import java.util.LinkedList;

public class StacksAndQueuesMain {
    static StackAndQueue stackAndQueue = new StackAndQueue();

    public static void main(String[] args) {
        createStack();

    }

    public static void createStack() {
        System.out.println("\n==================================UC1===================================\n");
        System.out.println("Stack is : ");
        stackAndQueue.push(70);
        stackAndQueue.push(30);
        stackAndQueue.push(56);
        stackAndQueue.display();

    }
}