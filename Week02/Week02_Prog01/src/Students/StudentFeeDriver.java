/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.util.Scanner;

/**
 *
 * @author S524965
 */
public class StudentFeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       
        System.out.println("Enter the Number of Credit Hours Enrolled In:");
        int creditHours=scan.nextInt();
        System.out.println("Enter the fee amount per credit hour:");
        double feePerCreditHour=scan.nextDouble();
        System.out.println("Enter the scholarship amount:");
        double scholarshipAmount=scan.nextDouble();
        System.out.println("Enter the health insurance amount per annum:");
        double healthInsurancePerAnnum=scan.nextDouble();
        
        System.out.println("");
        System.out.println("Student1 Information");
        StudentFee student1=new StudentFee(creditHours,feePerCreditHour,scholarshipAmount,healthInsurancePerAnnum);
        System.out.println(student1);
  
        
        System.out.println("Student1 tution fee : $"+student1.tuitionFee());
        System.out.println("Student1 scholarship : $"+student1.getScholarshipAmount());
        System.out.println("Student1 health insurance amount for 4 months: $"+student1.quaterlyHealthInsurance());
        System.out.println("Student1 total fee: $"+student1.totalFee());
        System.out.println("Student1 minimum due amount: $"+student1.minimumDue());
   
        System.out.println("");
        System.out.println("Student2 Fee Information:");
        StudentFee student2=new StudentFee();
        System.out.println(student2);
        
        student2.setCreditHours(9);
        student2.setFeePerCreditHour(594.90);
        student2.setHealthInsurancePerAnnum(1202.10);
        student2.setScholarshipAmount(1110.00);
        
        System.out.println("New Student2 Information:");
        System.out.println(student2);
        System.out.println("Student2 tution fee : $"+student2.tuitionFee());
        System.out.println("Student2 scholarship : $"+student2.getScholarshipAmount());
        System.out.println("Student2 health insurance amount for 4 months: $"+student2.quaterlyHealthInsurance());
        System.out.println("Student2 total fee: $"+student2.totalFee());
        System.out.println("Student2 minimum due amount: $"+student2.minimumDue());
   
 
    }
    
}
