package academy.learn.programming;

import java.util.Collections;

public class DataEncapsulation {




    public static void main(String[] args) {
        CompanyEncapsulation company = new CompanyEncapsulation();
        company.setName("GneGnaCompany");
        company.addEmployee("Tony");
        company.addEmployee("John");

        company.printInfoCompany();

        company.addEmployee(null);
    }

}