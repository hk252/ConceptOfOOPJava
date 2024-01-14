public class BasePlusCommissionEmployee extends CommissionEmployee {
    double base;

    public BasePlusCommissionEmployee () { }
    public BasePlusCommissionEmployee (String nameO, int ssnO, String addressO, sex genderO,
                                       double grossSalesO, double commissionRateO, double baseO) {
        super(nameO, ssnO,addressO, genderO, grossSalesO, commissionRateO);
        base = baseO;
    }
    public double getBase() { return base; }
    public void setBase(double baseO) { base = baseO; }

    @Override
    public String toString() { return "BasePlusCommissionEmployee{" + "base" + base + '}' ;}
    @Override
    public double earning() { return base + super.earning(); }
    @Override
    public void displayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public void displayEarning() { System.out.println("Earnings: " + earning()); }
}
