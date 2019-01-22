public class Person {
    String firstName;
    String lastName;

    Person (){
    }

    Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return speak();
    }

    public String speak(){
        return "I am speaking!";
    }

    public String printName(){
        return firstName + lastName;
    }

}
