package UMS.model;
public class Teacher {

        int teacherID;
        String name;

        public Teacher(int teacherID, String name){
            this.teacherID = teacherID;
            this.name = name;
        }
        public Teacher(){

        }

        public int getTeacherID() {
            return teacherID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTeacherID(int teacherID) {
            this.teacherID = teacherID;
        }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", name='" + name + '\'' +
                '}';
    }
}

