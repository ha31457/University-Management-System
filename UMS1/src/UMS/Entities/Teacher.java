package UMS.Entities;

import UMS.AbstractClasses.BaseEntity;

public class Teacher extends BaseEntity {

        public Teacher(int teacherID, String name){
            super(teacherID, name);
        }

    @Override
    public void displayDetails() {
        System.out.println("Teacher {" +
                "teacherID=" + id +
                ", name='" + name + '\'' +
                '}');
    }
}

