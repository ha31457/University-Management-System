package UMS.Controller;

import UMS.model.Course;
import UMS.model.Model;
import UMS.model.Student;
import UMS.model.Teacher;

import java.util.Scanner;

public class Admin {

//    private static Admin Instance;
//    public static Admin getInstance(){
//        return Instance;
//    }
    public static void Menu() {
        Model model = new Model();
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Enter your operation: ");
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
            System.out.println("10. Exit");

            int choice = sc.nextInt();
            int ID;
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    ID = sc.nextInt();

                    System.out.print("Enter Student Name: ");
//                    String sName = sc.nextLine();
                    String sName = sc.next();
                    String sLName = sc.next();

                    Student s = new Student(ID, sName);
                    model.AddStudent(s);
                    break;

                case 2:
                    System.out.println("Enter the Student ID to be removed: ");
                    ID = sc.nextInt();

                    if(model.RemoveStudent(ID)){
                        System.out.println("Student with ID " + ID + " removed!");
                    }
                    break;

                case 3:
                    model.PrintAllStudents();
                    break;

                case 4:
                    System.out.println("Enter Teacher ID : ");
                    ID = sc.nextInt();

                    System.out.println("Enter Teacher Name: ");
                    String tName = sc.next();
                    String tLName = sc.next();

                    Teacher t = new Teacher(ID,tName);
                    model.AddTeacher(t);
                    break;

                case 5:
                    System.out.println("Enter the Teacher ID to be removed: ");
                    ID = sc.nextInt();

                    if(model.RemoveTeacher(ID)){
                        System.out.println("Teacher with ID " + ID + "removed!");
                    }
                    break;
                case 6:
                    model.PrintAllTeachers();
                    break;
                case 7:
                    System.out.println("Enter Course ID : ");
                    ID = sc.nextInt();

                    System.out.println("Enter Course Name: ");
                    String cName = sc.next();
                    String cLName = sc.next();

                    Course c = new Course(ID, cName);
                    model.AddCourse(c);
                    break;

                case 8:
                    System.out.println("Enter the Course ID to be removed: ");
                    ID = sc.nextInt();

                    if(model.RemoveCourse(ID)){
                        System.out.println("Course with ID " + ID + "removed!");
                    }
                    break;
                case 9:
                    model.PrintAllCourses();
                    break;
                case 10:
                    System.exit(0);
            }
        }

    }
}