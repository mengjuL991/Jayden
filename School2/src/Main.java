public class Main {
    public static void main(String[] args) {

        //Create three teachers
        Teacher englishTeacher = new Teacher("Jaime", "Tong", "English");
        Teacher mathTeacher = new Teacher("Daniel", "Tong", "Math");
        Teacher physicsTeacher = new Teacher("Hamlen", "Glen", "Physics" );

        //Create ten students
        Student firstStudent = new Student("Jayden", "Liao", 12);
        Student secondStudent = new Student("Daniel", "Lin", 3);
        Student thirdStudent = new Student("Max", "Liang", 12);
        Student fourthStudent = new Student("Victor", "Ye", 11);
        Student fifthStudent = new Student("Oliver", "Huang", 12);
        Student sixthStudent = new Student("Peter","Sun", 10);
        Student seventhStudent = new Student("arthur", "Zhang", 11);
        Student eighthStudent = new Student("Barry", "Li", 12);
        Student ninthStudent = new Student("Bowen", "Huang", 10);
        Student tenthStudent= new Student("Chenhao", "Fu", 1);

        //Create a school
        School mySchool = new School(100, "Windermere", 1984);

        //Add 10 students to list
        mySchool.addStudent(firstStudent);
        mySchool.addStudent(secondStudent);
        mySchool.addStudent(thirdStudent);
        mySchool.addStudent(fourthStudent);
        mySchool.addStudent(fifthStudent);
        mySchool.addStudent(sixthStudent);
        mySchool.addStudent(seventhStudent);
        mySchool.addStudent(eighthStudent);
        mySchool.addStudent(ninthStudent);
        mySchool.addStudent(tenthStudent);

        //Add three teachers to list
        mySchool.addTeacher(englishTeacher);
        mySchool.addTeacher(mathTeacher);
        mySchool.addTeacher(physicsTeacher);

        //Show list of teachers
        System.out.println("LIST OF TEACHERS:");
        mySchool.showListOfTeachers();
        //Show list of Students
        System.out.println("LIST OF STUDENTS:");
        mySchool.showListOfStudents();

        //remove two students from list
        mySchool.deleteStudent(firstStudent);
        mySchool.deleteStudent(secondStudent);
        //remove one teacher from list
        mySchool.deleteTeacher(mathTeacher);

        //Show both list
        System.out.println("LIST OF TEACHERS:");
        mySchool.showListOfTeachers();
        System.out.println("LIST OF STUDENTS:");
        mySchool.showListOfStudents();
        System.out.println("Test");



    }
}
