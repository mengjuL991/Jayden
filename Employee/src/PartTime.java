public class PartTime extends HourlyEmployee {
    private boolean hasBenefits = true;

    PartTime(String name, int hireYear, int hoursPerWeek, int hourlyWage){
        super (name, hireYear, hoursPerWeek, hourlyWage);
    }

    public double annualSalary(){
        return getHireYear()*getHoursPerWeek()*52*getHourlyWage();
    }

    public double monthlySalary(){
        return getHoursPerWeek()*4*getHourlyWage();
    }

    @Override
    public boolean hasBenefits(){
        return hasBenefits;
    }

}
