package UMS.model;

import java.util.ArrayList;

public class Model {

    private ArrayList<Student> studentArrayList;
    private ArrayList<Teacher> teacherArrayList;
    private ArrayList<Course> courseArrayList;

    public Model(){
        studentArrayList = new ArrayList<Student>();
        teacherArrayList = new ArrayList<Teacher>();
        courseArrayList = new ArrayList<Course>();
    }

    public void AddStudent(Student s){
        studentArrayList.add(s);
    }

    public void AddTeacher(Teacher t){
        teacherArrayList.add(t);
    }

    public void AddCourse(Course c) { courseArrayList.add(c);}

    public boolean RemoveTeacher(int teacherID){
        for(Teacher teacher: teacherArrayList){
            if(teacher.getTeacherID() == teacherID){
                teacherArrayList.remove(teacher);
                return true;
            }
        }
        return false;
    }

    public boolean RemoveStudent(int studentID){
        for(Student student: studentArrayList){
            if(student.getEnrollmentID() == studentID){
                studentArrayList.remove(student);
                return true;
            }
        }
        return false;
    }

    public boolean RemoveCourse(int courseID){
        for(Course course: courseArrayList){
            if(course.getCourseID() == courseID){
                courseArrayList.remove(course);
                return true;
            }
        }
        return false;
    }

    public void PrintAllStudents(){
        for(Student student: studentArrayList){
            System.out.println(student.toString());
        }
    }

    public void PrintAllTeachers(){
        for(Teacher teacher: teacherArrayList){
            System.out.println(teacher.toString());
        }
    }

    public void PrintAllCourses(){
        for(Course course: courseArrayList){
            System.out.println(course.toString());
        }
    }
}
