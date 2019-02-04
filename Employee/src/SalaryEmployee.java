public class SalaryEmployee extends Employee {
    private int annualSalary;
    private boolean hasBenefits = true;

    SalaryEmployee(String name, int hireYear, int annualSalary) {
        super(name, hireYear);
        this.annualSalary = annualSalary;
    }

    @Override
    public double annualSalary() {
        return annualSalary;
    }

    @Override
    public double monthlySalary() {
        return (double) annualSalary / 12;
    }

    public boolean hasBenefits() {
        return hasBenefits;
    }
}