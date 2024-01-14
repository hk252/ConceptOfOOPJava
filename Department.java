import java.util.ArrayList;

public class Department {
    int departmentNumber;
    String departmentName;
    ArrayList <Employee> employeeList;
    public Department(){ }
    public Department(int departmentNumberO, String departmentNameO){
        departmentName = departmentNameO;
        departmentNumber = departmentNumberO;
        employeeList = new ArrayList <Employee> ();
    }

    public int getDepartmentNumber() { return departmentNumber; }
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentNumber(int departmentNumberO) { departmentNumber = departmentNumberO; }
    public void setDepartmentName(String departmentNameO) { departmentName = departmentNameO; }
    public void addEmployee (Employee employee) { employeeList.add(employee); }
    public void removeEmployee (int index) {employeeList.remove(index); }
    public int getArraySize () { return employeeList.size(); }

    public void printBasicData () {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("SSN: " + employeeList.get(i).getSsn() + " \\ "
                    + "Name: " + employeeList.get(i).getName() + " \\ "+"Gender: "
                    + employeeList.get(i).getGender());
        }
    }
    public void printAllDetails () {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) instanceof SalariedEmployee)
                ((SalariedEmployee) employeeList.get(i)).displayAllDetails();
            if (employeeList.get(i) instanceof HourlyEmployee)
                ((HourlyEmployee) employeeList.get(i)).displayAllDetails();
            if (employeeList.get(i) instanceof CommissionEmployee)
                ((CommissionEmployee) employeeList.get(i)).displayAllDetails();
        }
    }


}
