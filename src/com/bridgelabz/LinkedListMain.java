package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program");
        LinkedList<Integer> LinkedList1 = new LinkedList<>();
        LinkedList1.add(56);
        LinkedList1.add(70);
        LinkedList1.addAtIndex(1, 30);
        LinkedList1.show();
        String searchResult = (LinkedList1.searchByValue(30) == -1) ? "value not found in the list" : "value found at index " + LinkedList1.searchByValue(30);
        System.out.println(searchResult);
        System.out.println("After Inserting");
        LinkedList1.searchAndInsert(30, 40);
        LinkedList1.show();
    }
}