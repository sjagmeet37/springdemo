package com.tks.springdemo.model;

public class EmployeeInj {

    private Long empId;
    private String empName;
    private Company company;

    public EmployeeInj( Long empId, String empName, Company company )
    {
        this.empId = empId;
        this.empName = empName;
        this.company = company;
    }

    public Long getEmpId()
    {
        return empId;
    }

    public void setEmpId( Long empId )
    {
        this.empId = empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName( String empName )
    {
        this.empName = empName;
    }

    public Company getCompany()
    {
        return company;
    }

    public void setCompany( Company company )
    {
        this.company = company;
    }

    @Override
    public String toString()
    {
        return "EmployeeInj [company=" + company + ", empId=" + empId + ", empName=" + empName + "]";
    }


}
