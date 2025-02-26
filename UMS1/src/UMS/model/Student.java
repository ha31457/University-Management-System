package UMS.model;
import UMS.AbstractClasses.BaseEntity;

public class Student extends BaseEntity {

    public Student(int enrollmentID, String name){
        super(enrollmentID, name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.id = enrollmentID;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student {" +
                "enrollmentID=" + id +
                ", name='" + name + '\'' +
                '}');
    }
}