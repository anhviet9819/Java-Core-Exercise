package Bai13.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageEmployee {
    public List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public ManageEmployee(){
        this.employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        Employee employeeeAdd = employeeList.stream().filter(employee1 -> employee1.getId().equals(employee.getId())).findAny().orElse(null);
        if(employeeeAdd == null){
            this.employeeList.add(employee);
            System.out.println("Add employee successfully!");
        }else{
            System.out.println("Error. ID is already existed!");
        }
    }
    public void updateEmployee(String id, Employee employeeRequest){
        Employee employeeUpdate = this.employeeList.stream().filter(employee -> employee.getId().equals(id)).findAny().orElse(null);
        if(employeeUpdate != null){
            int indexEmployeeUpdate = employeeList.indexOf(employeeUpdate);
            this.employeeList.set(indexEmployeeUpdate, employeeRequest);
            System.out.println("Update employee successfully!");
        }
        else{
            System.out.println("Not found employee with id you 've entered!");
        }
    }
    public void deleteEmployee(String id){
        Employee employeeDelete = this.employeeList.stream().filter(employee -> employee.getId().equals(id)).findAny().orElse(null);
        if(employeeDelete != null){
            employeeList.remove(employeeDelete);
            System.out.println("Deleted employee with id "+ employeeDelete.getId());
        }
        else{
            System.out.println("Not found employee with id you 've entered!");
        }
    }
    public Employee searchEmployee(String id){
        Employee employeeSearch = this.employeeList.stream().filter(employee -> employee.getId().equals(id)).findAny().orElse(null);
        return employeeSearch;
    }
    public void showAllIntern(){
        List<Employee> employees = this.employeeList.stream().filter(employee -> employee.getEmployeeType() == 2).collect(Collectors.toList());
        employees.forEach(employee -> {
            int i = 1;
            System.out.println("Intern "+ i + " info " + ":");
            employee.showInfo();
            System.out.println("***********************************");
            i++;
        });
    }

    public void showAllFresher(){
        List<Employee> employees = this.employeeList.stream().filter(employee -> employee.getEmployeeType() == 1).collect(Collectors.toList());
        employees.forEach(employee -> {
            int i = 1;
            System.out.println("Fresher "+ i + " info " + ":");
            employee.showInfo();
            System.out.println("***********************************");
            i++;
        });
    }

    public void showAllExperience(){
        List<Employee> employees = this.employeeList.stream().filter(employee -> employee.getEmployeeType() == 0).collect(Collectors.toList());
        employees.forEach(employee -> {
            int i = 1;
            System.out.println("Experience employee "+ i + " info " + ":");
            employee.showInfo();
            System.out.println("***********************************");
            i++;
        });
    }
}
