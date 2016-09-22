/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06abstractandinterfaces;

/**
 *
 * @author Instructor
 */
public class StudentDriver 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // AbstractStudent abstractStudent = new AbstractStudent("Alex", 2300.0);
        //Abstract Class cannot be instantiated even though it has a constructor. 
        // If a class is defined with the keyword abstract, we 
        //may call its constructor only using "super" in a class that extends 
        //it, not via the "new" operator. 
        
        // Employer employer = new Employer();
        // Employee employee = new Employee();
        //Interface is absolutely abstract and cannot be instantiated.
        //If you define a reference variable whose type is an interface, 
        //any object you assign to it must be an instance of a class that 
        //implements the interface.
        
        
        
        System.out.println("Print Student Type Reference Variable");
        Student student = new Student("Calton", 2250.0, 3, "NWMSU", 10, 3.65, 10);
        System.out.println(student);
       
        System.out.println("Print AbstractStudent Type Reference Variable");
        AbstractStudent abstractStudent = new Student("Alex", 2300.0,3,"UHCL",
                14, 7.65, 5);
        System.out.println(abstractStudent);
        
        System.out.println("Print Employee Type Reference Variable");
        Employee employee = new Student("Kara", 3600.0, 2, "UCM", 12, 8.85, 20);
        System.out.println(employee);
     
        System.out.println("Print Employer Type Reference Variable");
        Employer employer = new Student("Adam", 3250.0, 4, "UMKC", 9, 4.32, 50);
        System.out.println(employer);
        
        System.out.println(" ");
        
        System.out.println("Using Student Type Reference Variable");
        System.out.println(String.format("Total Tuition Fee: $%.2f",student.getTuition()));
        System.out.println(String.format("Salary for one week: $%.2f",student.getWeeklySalary()));
        System.out.println("Number of Employees: " +student.getNumOfEmployees());
        student.setNumOfEmployees(22);
        System.out.println("Updated number of Employees: " 
                +student.getNumOfEmployees());
        
        System.out.println("");
        
        System.out.println("Using AbstractStudent Type Reference Variable");
        System.out.println(String.format("Total Tuition Fee: $%.2f", abstractStudent.getTuition()));
       // System.out.println("Salary for one week: $" + abstractStudent.getWeeklySalary());
       // System.out.println("Number of Employees: " +abstractStudent.getNumOfEmployees());
       // abstractStudent.setNumOfEmployees(60);
        
        System.out.println(" ");
        
        //If the reference variable is abstract class type and the object 
        //assigned to it is concrete class type that extends the abstract class,
        //then:Methods of the concrete class are not accessible using that variable. 
        //Inheritance is one way super classes can't inherit the sub class 
        //methods or variables.
        //Only the methods of that abstract class are accessible(fully 
        //implemented methods or abstract methods). 
        //If the invoked method is abstract then virtual machine drills 
        //down to find that method's implementation.
//         
         System.out.println("Using Employee Type Reference Variable");
        // System.out.println("Total Tuition Fee: $" +employee.getTuition());
         System.out.println(String.format("Salary for one week: $%.2f", employee.getWeeklySalary()));
        // System.out.println("Number of Employees: "+employee.getNumOfEmployees());
        // employee.setNumOfEmployees(60);
         
         System.out.println(" ");
         
         System.out.println("Using Employer Type Reference Variable");
        //System.out.println("Total Tuition Fee: $" +employer.getTuition());
        //System.out.println("Salary for one week: $" +employer.getWeeklySalary());
         System.out.println("Number of Employees: " +
                 employer.getNumOfEmployees());
         employer.setNumOfEmployees(60);
         System.out.println("Updated number of Employees: " +
                 employer.getNumOfEmployees());
     
        //If the reference variable is Interface type and the object assigned 
         //to it is concrete class type that implements interface, then:
        //Methods of the concrete class are not accessible using that variable. 
        //Only the methods of that particular Interface are accessible(default 
         //methods or abstract methods),
         //If the invoked method is abstract then virtual machine drills down 
         //to find that method's implementation.
    
    }
    
}