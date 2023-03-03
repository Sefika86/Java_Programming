package day03_variables;

public class EmployeeInfo_Variables_Task1 {
    public static void main(String[] args) {

       String employeeName = "Sefika Akin";
       int age = 36;
       char gender = 'F';
       String companyName = "Apple Inc",  //we can give many data under the same data type but not semi_colon but colon between them
               employeeID = "A19",
               jobTitle = "Software QA Engineer";
       int salary$ = 110000;
       Boolean isFullTime = true;

        System.out.println(employeeName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeID);
        System.out.println(jobTitle);
        System.out.println(salary$);
        System.out.println(isFullTime);

        System.out.println("-----------------------------------------------------------");

        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeID = "  + employeeID);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary$ = " + salary$);
        System.out.println("isFullTime = " + isFullTime);

        
    }

}


/*
 Create a class named EmployeeInfo.java
 Declare the following variables with appropriate data types:
     name
     age
     gender
     companyName
     employeeId
     jobTitle
     salary
     isFullTime
 */