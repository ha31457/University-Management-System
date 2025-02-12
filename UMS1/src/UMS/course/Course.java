package UMS.course;

public class Course {

    int courseID;
    String courseName;

    public Course(int courseID, String courseName){
        this.courseID = courseID;
        this.courseName = courseName;
    }

    public Course(){

    }

    public int getCourseID(){return courseID;}

    public String getCourseName(){return courseName;}

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setCourseID(int courseID){
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
