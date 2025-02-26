package UMS.Controller;

import UMS.model.*;

import java.util.Scanner;

public class Admin {

    static Model model;

    public void addStudent(int ID, String sName){
        Student s = new Student(ID, sName);
        if(model.add(s, EntityType.student)){
            System.out.println("Student added successfully.");
        }
        else{
            System.out.println("Student with ID " + ID + " FAILED to be added.");
        }
    }

    public void delStudent(int ID){
        if(model.remove(ID, EntityType.student)){
            System.out.println("Student with ID " + ID + " removed!");
        }
        else{
            System.out.println("Student with ID " + ID + " not present!");
        }
    }

    public void addTeacher(int ID, String tName){
        Teacher t = new Teacher(ID,tName);
        if(model.add(t, EntityType.teacher)){
            System.out.println("Teacher added successfully.");
        }
        else{
            System.out.println("Teacher with ID " + ID + " FAILED to be added.");

        }
    }

    public void delTeacher(int ID){
        if(model.remove(ID, EntityType.teacher)){
            System.out.println("Teacher with ID " + ID + " removed!");
        }
        else{
            System.out.println("Teacher with ID " + ID + " not present!");
        }
    }

    public void addCourse(int ID, String cName){
        Course c = new Course(ID, cName);
        if(model.add(c, EntityType.course)){
            System.out.println("Course added successfully!");
        }
        else{
            System.out.println("Course with ID " + ID + " failed to be added!");
        }
    }

    public void delCourse(int ID){
        if(model.remove(ID, EntityType.course)){
            System.out.println("Course with ID " + ID + " removed!");
        }
        else{
            System.out.println("Course with ID " + ID + " not present!");
        }
    }

    public void Menu() {

        Scanner sc = new Scanner(System.in);
        while(true){

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

            int choice = sc.nextInt();
            int ID;
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    ID = sc.nextInt();

                    System.out.print("Enter Student Name: ");
                    String sName = sc.next();

                    addStudent(ID, sName);
                    break;

                case 2:
                    System.out.println("Enter the Student ID to be removed: ");
                    ID = sc.nextInt();

                    delStudent(ID);
                    break;

                case 3:
                    model.displayAll(EntityType.student);
                    break;

                case 4:
                    System.out.println("Enter Teacher ID : ");
                    ID = sc.nextInt();

                    System.out.println("Enter Teacher Name: ");
                    String tName = sc.next();

                    addTeacher(ID, tName);
                    break;

                case 5:
                    System.out.println("Enter the Teacher ID to be removed: ");
                    ID = sc.nextInt();

                    delTeacher(ID);
                    break;
                case 6:
                    model.displayAll(EntityType.teacher);
                    break;
                case 7:
                    System.out.println("Enter Course ID : ");
                    ID = sc.nextInt();

                    System.out.println("Enter Course Name: ");
                    String cName = sc.next();

                    addCourse(ID, cName);
                    break;

                case 8:
                    System.out.println("Enter the Course ID to be removed: ");
                    ID = sc.nextInt();

                    delCourse(ID);
                    break;
                case 9:
                    model.displayAll(EntityType.course);
                    break;
                case 10:
                    System.exit(0);
            }
        }

    }

    public static void main(String[] args) {
        Admin ad = new Admin();
        model = new Model();
        ad.Menu();
    }
}