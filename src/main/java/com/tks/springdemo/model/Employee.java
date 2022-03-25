package com.tks.springdemo.model;

public class Employee {
    private String empId;

    public String getEmpId()
    {
        return empId;
    }

    public void setEmpId( String empId )
    {
        this.empId = empId;
    }

    @Override
    public String toString()
    {
        return "Employee [empId=" + empId + "]";
    }

}

