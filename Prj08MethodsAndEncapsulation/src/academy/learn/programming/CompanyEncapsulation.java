package academy.learn.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// POJO
public class CompanyEncapsulation {


    private String name;
    private List<String> employees = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name == null || name.isEmpty()){
            System.out.println("Name can't be set");
            return;
        }
        this.name = name;
    }

    public List<String> getEmployees() {
        return employees;
    }
/*
    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }*/

    public void addEmployee(String employee){
        if(employee==null || employee.isEmpty()){
            System.out.println("Employee can't be added");
            return;
        }
        employees.add(employee);
    }

    public void printInfoCompany(){
        System.out.println(name);
        Collections.sort(employees);
        System.out.println(employees);
    }
}