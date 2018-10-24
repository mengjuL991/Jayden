
//Teacher class
public class Teacher {

    //Teacher's fields: firstName, lastName, subject
    private String firstName;
    private String lastName;
    private String subject;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    //Teacher's constructor
    public Teacher (String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //Method: print Name: name Subject: subject
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + " Subject: " + this.subject;
    }



}
