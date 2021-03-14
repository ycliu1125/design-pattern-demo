package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;

    private List<Employee> employeeList;

    public Company() {
        employeeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void accept(Visitor visitor) {
        employeeList.forEach(employee -> employee.accept(visitor));
    }
}
