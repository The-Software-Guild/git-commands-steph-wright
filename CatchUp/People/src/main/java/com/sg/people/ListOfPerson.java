/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.people;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class ListOfPerson {
    Person[] personList;
    int totalNoOfPersons;

    public ListOfPerson(int totalNoOfPersons) {
        this.totalNoOfPersons = totalNoOfPersons;
        this.personList = new Person[totalNoOfPersons];
    }
    
    public void displayPersons() {
        for (Person person: personList) {
            System.out.println(person.getPersonId());
            System.out.println(person.getPersonName());
            System.out.println(person.getAge());
        }
    }
    
    public void inputPersons(Person person, int index) {
        personList[index] = person;
        }
    }

