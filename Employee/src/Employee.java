public abstract class Employee {
    private String name;
    private int hireYear;

    Employee(){
        name = "Undefined";
        hireYear = 0;
    }

    Employee(String name, int hireYear ){
        this.name = name;
        this.hireYear = hireYear;
    }

    public String getName()  {
        return name;
    }

    public int getHireYear() {
        return hireYear;
    }

    public String toString(){
        return name;
    }

    abstract double annualSalary();
    abstract double monthlySalary();




}








