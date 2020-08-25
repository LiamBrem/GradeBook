package com.liam;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Who are you (type: \"student\" or \"teacher\" or \"admin\")");

        //navigates to different panels
        String user = input.nextLine();
        if (user.equals("student")){
            System.out.println("directing to student panel");
            divide();
            studentPanel();
        } else if (user.equals("teacher")) {
            System.out.println("directing to teacher panel");
            divide();
            teacherPanel();
        } else if (user.equals("admin")) {
            System.out.println("directing to admin panel");
            divide();
            adminPanel();
        } else {
            System.out.println("please type: \"student\" or \"teacher\" or \"admin\"");
            main(null);
        }
    }

    public static void divide(){
        System.out.println("+++++++++++++++++");
    }

    public static void studentPanel(){
        System.out.println("You are at the student Panel");
        System.out.println();

    }

    public static void teacherPanel(){
        System.out.println("You are at the teacher panel");
        System.out.println();
        //view schedule
        //navigate to class
        //change student grades for each class
    }

    public static void adminPanel(){
        System.out.println("You are at the admin Panel");
        System.out.println();


        Scanner keyboard = new Scanner(System.in);
        System.out.println("What Would You Like To Do?");
        System.out.println("\"new student\" or \"back\"");
        String admin = keyboard.nextLine();

        if (admin.equals("new student")){
            Admin mainAdmin = new Admin();
            mainAdmin.createNewStudent();
        } else if (admin.equals("back")) {
            main(null);
        }


        //add/remove students
        //add/remove teachers
        //add/remove classes
        //edit student/teacher schedules
    }

}
