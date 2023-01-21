package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program");
        LinkedList<Integer> LinkedList1 = new LinkedList<>();
        LinkedList1.add(56);
        LinkedList1.add(70);
        LinkedList1.addAtIndex(1, 30);
        LinkedList1.show();
        System.out.println("After Inserting");
        LinkedList1.searchAndInsert(30,40);
        LinkedList1.show();
        System.out.println();
        LinkedList1.searchValueAndDelete(40);
        System.out.println("After Deleting");
        LinkedList1.show();
        System.out.println("Size of list is : " + LinkedList1.size());

    }
}

