package org.example;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(26, "Steph");
        System.out.println(p1);
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
    }
}