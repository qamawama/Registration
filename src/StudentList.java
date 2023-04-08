import java.util.ArrayList;
public class StudentList {
    private ArrayList<Student> students = new ArrayList<>();
    private Student selectedStudent;

    // Method: addStudent
    public void addStudent(Student student){
        students.add(student);
    }

    // Method: search student
    public void searchStudent(){

    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void displayStudent(){

    }

}
