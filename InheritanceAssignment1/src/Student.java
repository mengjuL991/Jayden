import java.security.PrivateKey;
import java.util.ArrayList;

public class Student extends Person {
    static private int counter = 100001;
    private int studentId;
    ArrayList<Course> listOfTookCourses = new ArrayList<>();

    Student(String firstName, String lastName){
        super(firstName, lastName);
        this.studentId = counter++;
    }

    public int printStudentId(){
        return studentId;
    }
}
