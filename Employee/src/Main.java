public class Main {

    public static void main(String[] args) {
        SalaryEmployee Jayden = new SalaryEmployee("Jayden", 12, 1800);
        FullTime Jimmy = new FullTime("Jimmy",12,30,10);
        PartTime Jason = new PartTime("Jason",9,90,50);

        System.out.println(Jimmy.monthlySalary());
        System.out.println(Jason.annualSalary());
        System.out.println(Jimmy.hasBenefits());

        System.out.println(Jayden.monthlySalary());
        System.out.println(Jayden.annualSalary());
        System.out.println(Jayden.getHireYear());
        System.out.println(Jayden.hasBenefits());
    }
}
