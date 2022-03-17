package com.datastruct;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWIthLinkedList {

    public static void main(String[] args) {
        LinkedList<Person> linkedlist = new LinkedList<>();
        linkedlist.add(new Person("Alex",21));
        linkedlist.add(new Person("Alexa",18));
        linkedlist.addLast(new Person("Richard", 30));
        linkedlist.addFirst(new Person("Ali",45));
        ListIterator iterator = linkedlist.listIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        while(iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
    }


    static record Person(String name, int age){

    }

}
