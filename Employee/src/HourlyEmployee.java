public abstract class HourlyEmployee extends Employee{
    private double hoursPerWeek;
    private double hourlyWage;
    private boolean hasBenefits = true;

    HourlyEmployee(String name, int hireYear, double hoursPerWeek, double hourlyWage) {
        super(name, hireYear);
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyWage = hourlyWage;
    }

    public double getHoursPerWeek(){
        return hoursPerWeek;
    }

    public double getHourlyWage(){
        return hourlyWage;
    }

    abstract boolean hasBenefits();

}
