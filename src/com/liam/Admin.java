package com.liam;

import java.io.*;
import java.util.Scanner;


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
            String fileName = "students.txt";

            FileWriter fw = new FileWriter(fileName, true);
            fw.write(firstName);
            fw.write("\n");
            fw.close();
            System.out.println("successfully wrote to the file");
        } catch (IOException e){
            System.out.println("error");

        }

        Student m = new Student(input, firstName, lastName, dob);
        System.out.println(firstName + ' ' + lastName + ' ' + dob);

        Main.main(null);

        //add ability to go back
        //write students to a text file
    }



    //method to create/remove student objects
    //method to create/remove teacher objects
    //method to create/remove classes
}
