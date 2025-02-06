package UMS.admin;

import UMS.model.Model;
import UMS.student.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {

    private void AddStudent(){

    }
    public static void main(String[] args){
        Menu();
    }

    private static void Menu() {
        Model model = new Model();
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Enter your operation: ");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("2. Print Student List");
            System.out.println("10. Exit");

            int choice = sc.nextInt();
            int sID;
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    sID = sc.nextInt();

                    System.out.println("Enter Student Name: ");
                    String sName = sc.nextLine();

                    Student s = new Student(sID, sName);
                    model.AddStudent(s);
                    break;

                case 2:
                    System.out.println("Enter the ID to be removed: ");
                    sID = sc.nextInt();

                    model.RemoveStudent(sID);
                    System.out.println("Student with ID " + sID + " removed!");
                    break;

                case 3:
                    model.PrintAllStudents();
                    break;

                case 10:
                    System.exit(0);
            }
        }

    }
}
