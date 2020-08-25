package com.liam;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Admin {
    public Admin(){

    }

    public void createNewStudent() {
        //creates a new object
        
        System.out.println("Test");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type something to create a student object ");
        String input = keyboard.nextLine();

        //credentials
        Scanner studentFirstNameInput = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = keyboard.nextLine();

        Scanner studentLastNameInput = new Scanner(System.in);
        System.out.println("Enter last name: ");
        String lastName = keyboard.nextLine();

        Scanner dobInput = new Scanner(System.in);
        System.out.println("Enter Date Of Birth");
        String dob = keyboard.nextLine();


        try {
            FileWriter fw = new FileWriter("Test");
            fw.write("This is a test");
            fw.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        Student m = new Student(input, firstName, lastName, dob);
        System.out.println(firstName + ' ' + lastName + ' ' + dob);

        //add ability to go back
        //write students to a text file
    }



    //method to create/remove student objects
    //method to create/remove teacher objects
    //method to create/remove classes
}
