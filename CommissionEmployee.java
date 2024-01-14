public class CommissionEmployee extends Employee implements Displayable{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee () { }
    public CommissionEmployee (String nameO, int ssnO, String addressO, sex genderO,
                               double grossSalesO, double commissionRateO) {
        super(nameO, ssnO, addressO, genderO);
        grossSales = grossSalesO;
        commissionRate = commissionRateO;
    }

    public void setCommissionRate(double commissionRateO) { commissionRate = commissionRateO; }
    public void setGrossSales(double grossSalesO) {grossSales = grossSalesO; }
    public double getCommissionRate() { return commissionRate; }
    public double getGrossSales() { return grossSales; }

    @Override
    public String toString() {
        return "CommissionEmployee{" + "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate + '}';
    }
    @Override
    public double earning (){ return grossSales * commissionRate; }
    @Override
    public void displayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public void displayEarning() { System.out.println("Earnings: " + earning()); }
}
