package UMS.Controller;

import UMS.Exceptions.DuplicateIDException;
import UMS.Exceptions.IdNotFoundException;
import UMS.Exceptions.NegativeIDException;
import UMS.Storage.EntityType;
import UMS.Storage.Model;
import UMS.Entities.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin {

    static Model model;

    public void addStudent(int ID, String sName){
        try {
            if (sName.isEmpty()) {
                System.out.println("Error: Student name cannot be blank.");
                return;
            }
            Student s = new Student(ID, sName);
            if (model.add(s, EntityType.student)) {
                System.out.println("Student added successfully.");
            }
        }
        catch(DuplicateIDException | NegativeIDException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void delStudent(int ID){
        try{
            if(model.remove(ID, EntityType.student)){
                System.out.println("Student with ID " + ID + " removed!");
            }
        }catch (IdNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void addTeacher(int ID, String tName){
        try{
            if (tName.isEmpty()) {
                System.out.println("Error: Teacher name cannot be blank.");
                return;
            }
            Teacher t = new Teacher(ID,tName);
            if(model.add(t, EntityType.teacher)){
                System.out.println("Teacher added successfully.");
            }
        }
        catch(DuplicateIDException | NegativeIDException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void delTeacher(int ID){
        try{
            if(model.remove(ID, EntityType.teacher)){
                System.out.println("Teacher with ID " + ID + " removed!");
            }
        }catch(IdNotFoundException e){
            System.out.println("Error:" + e.getMessage());
        }
    }

    public void addCourse(int ID, String cName){
        try{
            if (cName.isEmpty()) {
                System.out.println("Error: Course name cannot be blank.");
                return;
            }
            Course c = new Course(ID, cName);
            if(model.add(c, EntityType.course)){
                System.out.println("Course added successfully!");
            }
        }catch(DuplicateIDException | NegativeIDException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void delCourse(int ID){
        try{
            if(model.remove(ID, EntityType.course)){
                System.out.println("Course with ID " + ID + " removed!");
            }
        }catch (IdNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void Menu() {

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("\nEnter your operation: ");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Print Student List");
            System.out.println();
            System.out.println("4. Add Teacher");
            System.out.println("5. Remove Teacher");
            System.out.println("6. Print all Teachers");
            System.out.println();
            System.out.println("7. Add Course");
            System.out.println("8. Remove Course");
            System.out.println("9. Print all Courses");
            System.out.println();
            System.out.println("10. Exit\n");

            try {
                int choice = sc.nextInt();
                int ID;
                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter Student ID: ");
                            sc.nextLine();
                            String input = sc.nextLine();
                            if (input.isEmpty()) {
                                System.out.println("Error: Student ID cannot be blank.");
                                continue;
                            }
                            try {
                                ID = Integer.parseInt(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Error: Please enter a valid integer for the ID");
                                continue;
                            }

                            System.out.print("Enter Student Name: ");
                            String sName = sc.nextLine();

                            if (sName.isEmpty()) {
                                System.out.println("Error: Student name cannot be blank.");
                                continue;
                            }

                            addStudent(ID, sName);
                        } catch (InputMismatchException e) {
                            System.out.println("Error: enter an integer value");
                            sc.nextLine();
                        }
                        break;

                    case 2:
                        try {
                            System.out.println("Enter the Student ID to be removed: ");
                            sc.nextLine();
                            String input = sc.nextLine();
                            if (input.isEmpty()) {
                                System.out.println("Error: Student ID cannot be blank.");
                                continue;
                            }
                            try {
                                ID = Integer.parseInt(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Error: Please enter a valid integer for the ID");
                                continue;
                            }

                            delStudent(ID);
                        } catch (InputMismatchException e) {
                            System.out.println("Error: enter an integer value");
                            sc.nextLine();
                        }
                        break;

                    case 3:
                        model.displayAll(EntityType.student);
                        break;

                    case 4:
                        try {
                            System.out.println("Enter Teacher ID : ");
                            sc.nextLine();
                            String input = sc.nextLine();
                            if (input.isEmpty()) {
                                System.out.println("Error: Teacher ID cannot be blank.");
                                continue;
                            }
                            try {
                                ID = Integer.parseInt(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Error: Please enter a valid integer for the ID");
                                continue;
                            }

                            System.out.println("Enter Teacher Name: ");
                            String tName = sc.nextLine();

                            if (tName.isEmpty()) {
                                System.out.println("Error: Teacher name cannot be blank.");
                                continue;
                            }

                            addTeacher(ID, tName);
                        } catch (InputMismatchException e) {
                            System.out.println("Error: enter an integer value");
                            sc.nextLine();
                        }
                        break;

                    case 5:
                        try {
                            System.out.println("Enter the Teacher ID to be removed: ");
                            sc.nextLine();
                            String input = sc.nextLine();
                            if (input.isEmpty()) {
                                System.out.println("Error: Teacher ID cannot be blank.");
                                continue;
                            }
                            try {
                                ID = Integer.parseInt(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Error: Please enter a valid integer for the ID");
                                continue;
                            }

                            delTeacher(ID);
                        } catch (InputMismatchException e) {
                            System.out.println("Error: enter an integer value");
                            sc.nextLine();
                        }
                        break;

                    case 6:
                        model.displayAll(EntityType.teacher);
                        break;

                    case 7:
                        try {
                            System.out.println("Enter Course ID : ");
                            sc.nextLine();
                            String input = sc.nextLine();
                            if (input.isEmpty()) {
                                System.out.println("Error: Course ID cannot be blank.");
                                continue;
                            }
                            try {
                                ID = Integer.parseInt(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Error: Please enter a valid integer for the ID");
                                continue;
                            }

                            System.out.println("Enter Course Name: ");
                            String cName = sc.nextLine();

                            if (cName.isEmpty()) {
                                System.out.println("Error: Course name cannot be blank.");
                                continue;
                            }

                            addCourse(ID, cName);
                        } catch (InputMismatchException e) {
                            System.out.println("Error: enter an integer value");
                            sc.nextLine();
                        }
                        break;

                    case 8:
                        try {
                            System.out.println("Enter the Course ID to be removed: ");
                            sc.nextLine();
                            String input = sc.nextLine();
                            if (input.isEmpty()) {
                                System.out.println("Error: Course ID cannot be blank.");
                                continue;
                            }
                            try {
                                ID = Integer.parseInt(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Error: Please enter a valid integer for the ID");
                                continue;
                            }

                            delCourse(ID);
                        } catch (InputMismatchException e) {
                            System.out.println("Error: enter an integer value");
                            sc.nextLine();
                        }
                        break;

                    case 9:
                        model.displayAll(EntityType.course);
                        break;

                    case 10:
                        System.exit(0);
                    default:
                        System.out.println("Enter a valid choice (1-10) ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Select an integer option");
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Admin ad = new Admin();
        model = new Model();
        ad.Menu();
    }
}
