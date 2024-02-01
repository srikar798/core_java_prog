package com.meta.cj.day26;

import java.util.LinkedList;

/* public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("JavaScript");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.addFirst("Rust");

        System.out.println(list);

    }
}*/


public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Adding elements at specific positions
        linkedList.addFirst("Grapes");
        linkedList.addLast("Mango");
        linkedList.add(2, "Pineapple");

        System.out.println("LinkedList after adding elements: " + linkedList);

        // Removing elements from the LinkedList
        String removedFirst = linkedList.removeFirst();
        String removedLast = linkedList.removeLast();
        linkedList.remove("Banana");

        System.out.println("Removed first element: " + removedFirst);
        System.out.println("Removed last element: " + removedLast);
        System.out.println("LinkedList after removing elements: " + linkedList);

        // Accessing elements in the LinkedList
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        String elementAtIndexTwo = linkedList.get(2);

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("Element at index 2: " + elementAtIndexTwo);

        // Iterating over the elements using Iterator
        System.out.print("Elements using Iterator: ");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Iterating over the elements using ListIterator
        System.out.print("Elements using ListIterator (forward): ");
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // Checking if the list contains an element
        boolean containsOrange = linkedList.contains("Orange");
        System.out.println("Does the list contain 'Orange'? " + containsOrange);

        // Getting the index of an element
        int indexOfPineapple = linkedList.indexOf("Pineapple");
        System.out.println("Index of 'Pineapple': " + indexOfPineapple);

        // Checking if the list is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // Clearing the list
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
