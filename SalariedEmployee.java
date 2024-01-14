public class SalariedEmployee extends Employee implements Displayable{
    double salary;
    double bonus;
    double deductions;

    public SalariedEmployee(){  };
    public SalariedEmployee (String nameO, int ssnO, String addressO, sex genderO,
                             double salaryO, double bonusO, double deductionsO) {
        super(nameO, ssnO, addressO, genderO);
        salary = salaryO;
        bonus = bonusO;
        deductions = deductionsO;
    }

    public void setSalary(double salaryO) { salary = salaryO; }
    public void setBonus(double bonusO) { bonus = bonusO; }
    public void setDeductions(double deductionsO) { deductions = deductionsO; }

    public double getSalary() { return salary; }
    public double getBonus() { return bonus; }
    public double getDeductions() { return deductions; }

    @Override
    public double earning() { return (salary + bonus) - deductions; }
    @Override
    public void displayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary +
                ", bonus=" + bonus + ", deductions=" + deductions + '}';
    }
    public void displayEarning() { System.out.println("Earnings: " + earning()); }
}
