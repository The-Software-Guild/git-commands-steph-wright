/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.people;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people do you want to enter into the list?");
        int people = sc.nextInt();
        
        ListOfPerson list = new ListOfPerson(people);
        
        for (int index=0; index < people; index++){
            System.out.println("Enter person id:");
            String personId = sc.next();
            System.out.println("Enter person's name:");
            String personName = sc.next();
            System.out.println("Enter person's age:");
            int age = sc.nextInt();
            Person person = new Person(personId, personName, age);
            list.inputPersons(person, index);
        }
        
        list.displayPersons();
    }
}
