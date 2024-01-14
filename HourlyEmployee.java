public class HourlyEmployee extends Employee implements Displayable{
    double hourRate;
    int numberOfHours;

    public HourlyEmployee () {  }

    public HourlyEmployee (String nameO, int ssnO, String addressO, sex genderO,
                           double hourRateO, int numberOfHoursO) {
        super( nameO, ssnO, addressO, genderO);
        hourRate = hourRateO;
        numberOfHours = numberOfHoursO;
    }

    public void setNumberOfHours(int numberOfHoursO) { numberOfHours = numberOfHoursO; }
    public void setHourRate(double hourRateO) { hourRate = hourRateO; }

    public double getHourRate() { return hourRate; }
    public int getNumberOfHours() { return numberOfHours; }

    @Override
    public double earning() { return hourRate * numberOfHours; }
    @Override
    public void displayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public void displayEarning (){ System.out.println("Earnings: " + earning()); }
    @Override
    public String toString() {
        return "HourlyEmployee{" + "hourRate=" + hourRate + ", numberOfHours=" + numberOfHours + '}';
    }
}
