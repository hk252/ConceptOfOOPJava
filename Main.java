public class Main {
    public static void main(String[] args) {
        Department department1 = new Department(1,
                "Information System");
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Ahmed", 12,
                "Egypt", sex.male, 10000, 1000, 200 );
        department1.addEmployee(salariedEmployee1);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Shafeq", 13,
                "Hgnaya", sex.male, 150, 3);
        department1.addEmployee(hourlyEmployee1);

        CommissionEmployee commissionEmployee1 = new CommissionEmployee("Khaled", 18,
                "Miami", sex.male, 1200,35);
        department1.addEmployee(commissionEmployee1);

        System.out.println(department1.getArraySize());
        department1.printBasicData();
        department1.printAllDetails();

    }
}