package com.tks.springdemo;

import com.tks.springdemo.model.Company;
import com.tks.springdemo.model.Employee;
import com.tks.springdemo.model.EmployeeInj;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee springCtxtEmp = (Employee) context.getBean("employee1");
        System.out.println(springCtxtEmp);

        Employee employee = new Employee();
        System.out.println(employee);

        Company springCtxtCompany = (Company) context.getBean("company");
        System.out.println(springCtxtCompany);

        EmployeeInj springCtxtEmployeeConstructorInjection = (EmployeeInj) context.getBean("employee2");
        System.out.println(springCtxtEmployeeConstructorInjection);

        EmployeeInj springCtxtEmployee3ConstructorInjection = (EmployeeInj) context.getBean("employee3");
        System.out.println(springCtxtEmployee3ConstructorInjection);

        Employee springCtxtEmp1 = (Employee) context.getBean("employee1");
        Employee springCtxtEmp2 = (Employee) context.getBean("employee1");

        System.out.println(springCtxtEmp1.hashCode());
        System.out.println(springCtxtEmp1.equals(springCtxtEmp2));
        System.out.println(springCtxtEmp2.hashCode());

    }
}




