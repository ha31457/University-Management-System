package UMS.Entities;

import UMS.AbstractClasses.BaseEntity;

public class Course extends BaseEntity {

    public Course(int courseID, String courseName){
        super(courseID, courseName);
    }

    @Override
    public void displayDetails() {
        System.out.println("Course {" +
                "courseID=" + id +
                ", courseName='" + name + '\'' +
                '}');
    }
}
