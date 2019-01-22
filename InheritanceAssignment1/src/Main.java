import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Teacher dan = new Teacher("Daniel", "Lin");
        Teacher max = new Teacher("Max", "Jordan");
        Teacher jay = new Teacher("Jayden", "Curry");

        Student ken = new Student("Kenny","Johnson");
        Student mike = new Student("Michael","Jimmy");
        Student tong = new Student("Tong", "Lee");

        Course math = new Course("Math",12);
        Course english = new Course("English", 12);
        Course physic = new Course("Physic", 12);
        Course chemistry = new Course("Chemistry", 12);
        Course mandarin = new Course("Mandarin", 12);
        Course foodStudy = new Course("foodStudy", 12);

        dan.listOfTaughtCourses.add(english);
        dan.listOfTaughtCourses.add(chemistry);
        dan.listOfTaughtCourses.add(physic);
        dan.listOfTaughtCourses.add(foodStudy);

        mike.listOfTookCourses.add(foodStudy);
        mike.listOfTookCourses.add(mandarin);
        mike.listOfTookCourses.add(english);

        System.out.println("Daniel's ID " + dan.printTeacherId());
        System.out.print("Daniel's taught courses" + Arrays.toString(dan.listOfTaughtCourses.toArray()));

        dan.listOfTaughtCourses.set(0,math);
        System.out.print("\nDaniel's changed courses" + Arrays.toString(dan.listOfTaughtCourses.toArray()));

        dan.listOfTaughtCourses.remove(3);
        System.out.print("\nDaniel's deleted courses" + Arrays.toString(dan.listOfTaughtCourses.toArray()));

        System.out.println("\nMichael's ID " + mike.printStudentId());
        System.out.print("Michael took courses" + Arrays.toString(mike.listOfTookCourses.toArray()));



    }
}
