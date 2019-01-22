import java.util.ArrayList;

public class Teacher extends Person{
    static private int counter = 200001;
    private int employeeId;
    ArrayList<Course> listOfTaughtCourses = new ArrayList<>();

    Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        this.employeeId = counter++;
    }

    public int printTeacherId(){
        return employeeId;
    }
}
