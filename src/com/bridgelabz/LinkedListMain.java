package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program");
        LinkedList<Integer> LinkedList1 = new LinkedList<>();
        LinkedList1.add(56);
        LinkedList1.add(70);
        LinkedList1.addAtIndex(1, 30);
        System.out.println("Before Deleting Last Element");
        LinkedList1.show();
        System.out.println("After Deleting Last Element");
        LinkedList1.popLast();
        LinkedList1.show();
    }
}