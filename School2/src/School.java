import java.util.ArrayList;

//School class
public class School {

    //hold an arrayList of Teachers, hold an arrayList of Students
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();

    //School's fields: size, name, year of built
    private double size;
    private String name;
    private int yearBuilt;

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    //School's constructor
    public School(double size, String name, int yearBuilt) {
        this.size = size;
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    //Methods: adding teachers and students to lists
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }

    //Methods: removing teachers form list
    public void deleteTeacher(Teacher teacher) {
        teacherList.remove(teacher);
    }

    //Methods: removing students from list
    public void deleteStudent(Student student) {
        studentList.remove(student);
    }

    //Methods: Showing list of teachers
    public void showListOfTeachers() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    //Methods: Showing list of students
    public void showListOfStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }

    }


}
