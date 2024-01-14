enum sex {male, female};
public abstract class Employee {
    String name;
    int ssn;
    String address;
    sex gender;

    public Employee(){  }
    public Employee (String nameO, int ssnO, String addressO, sex genderO) {
        name = nameO;
        ssn = ssnO;
        address = addressO;
        gender = genderO;
    }

    public void setName(String nameO) { name = nameO; }
    public void setAddress(String addressO) { address = addressO; }
    public void setSsn(int ssnO) { ssn = ssnO; }
    public void setGender(sex genderO) { gender = genderO; }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getSsn() { return ssn; }
    public sex getGender() { return gender; }

    public abstract double earning ();

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", ssn=" + ssn +
                ", address='" + address + '\'' + ", gender=" + gender + '}';
    }
}
