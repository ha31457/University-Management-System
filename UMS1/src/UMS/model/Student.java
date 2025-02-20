package UMS.model;

public class Student {

    int enrollmentID;
    String name;

    public Student(int enrollmentID, String name){
        this.enrollmentID = enrollmentID;
        this.name = name;
    }
    public Student(){

    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrollmentID=" + enrollmentID +
                ", name='" + name + '\'' +
                '}';
    }
}