package UMS.model;

import UMS.student.Student;
import UMS.teacher.Teacher;

import java.util.ArrayList;

public class Model {

    private ArrayList<Student> studentArrayList;
    private ArrayList<Teacher> teacherArrayList;

    public Model(){
        studentArrayList = new ArrayList<Student>();
        teacherArrayList = new ArrayList<Teacher>();
    }

    public void AddStudent(Student s){
        studentArrayList.add(s);
    }

    public void AddTeacher(Teacher t){
        teacherArrayList.add(t);
    }

    public void RemoveTeacher(int teacherID){
        for(Teacher teacher: teacherArrayList){
            if(teacher.getTeacherID() == teacherID){
                teacherArrayList.remove(teacher);
            }
        }
    }

    public void RemoveStudent(int studentID){
        for(Student student: studentArrayList){
            if(student.getEnrollmentID() == studentID){
                studentArrayList.remove(student);
            }
        }
    }

    public void PrintAllStudents(){
        for(Student student: studentArrayList){
            System.out.println(student.toString());
        }
    }
}
