package sample;

public class Friend {
    String name;
    int age;
    String phoneNumber;
    String address;
    String emailAddress;

    public Friend(){
        this.name = "UNKNOWN";
        this.age = 0;
        this.phoneNumber = "UNKNOWN";
        this.address = "UNKNOWN";
        this.emailAddress = "UNKNOWN";
    }

    public Friend (String name, int age, String phoneNumber, String address, String emailAddress){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.emailAddress = emailAddress;
    }

    public String toString(){
        return this.name;
    }

    public Integer getAge(){
        return age;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }





}
