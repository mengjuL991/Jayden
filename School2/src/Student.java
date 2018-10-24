
//Student class
public class Student {

    //Student's fields
    static private int counter = 100001;
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //Student's constructor
    public Student (String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        //Unique Student numbers created
        this.studentNumber = counter++;
    }

    //Method: print Name: name Grade: grade
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + " Grade: " + this.grade;
    }
}
