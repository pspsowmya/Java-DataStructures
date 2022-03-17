package com.datastruct;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alex",21));
        queue.add(new Person("John",50));
        queue.add(new Person("Richard",35));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());

    }

    static record Person(String name, int age){

    }
}
