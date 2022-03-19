package com.datastruct;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {

    public static void main(String[] args) {
        Map<Person, Diamond> newMap = new HashMap<>();
        newMap.put(new Person("John"), new Diamond("Diamond1"));

        System.out.println(newMap.get(new Person("John")).hashCode());
        System.out.println(newMap.get(new Person("John")));
    }

    public static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alexx"));
        map.put(2, new Person("Ali"));
        map.put(3, new Person("Mariam"));
        map.put(3, new Person("Mariam"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());

        map.remove(3);
        map.entrySet().forEach(System.out::println);
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        map.forEach(((key, person) -> {
            System.out.println(key + "-" + person);
        }));

        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println(map.values());
    }

    //record Person(String name){}
    static class Person {

        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }   

    record Diamond(String name) {
    }


}
