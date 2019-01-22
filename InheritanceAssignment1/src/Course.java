public class Course {
    String courseName;
    int courseLevel;

    Course(String courseName, int courseLevel) {
        this.courseName = courseName;
        this.courseLevel = courseLevel;
    }

    public String toString() {
        return courseName;
    }
}
