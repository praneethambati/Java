/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

/**
 *
 * @author S524965
 */
public class StudentFee {
    
    private int creditHours;
    private double feePerCreditHour;
    private double scholarshipAmount;
    private double healthInsurancePerAnnum;

    /**
     * This is a constructor for the class "StudentFee" taking four parameters.
     * @param creditHours Number of credits hours a student enrolls in.
     * @param feePerCreditHour Fee per each credit hour.
     * @param scholarshipAmount scholarship amount for a student.
     * @param healthInsurancePerAnnum health insurance amount for annum.
     */
    public StudentFee(int creditHours, double feePerCreditHour, double scholarshipAmount, double healthInsurancePerAnnum) {
        this.creditHours = creditHours;
        this.feePerCreditHour = feePerCreditHour;
        this.scholarshipAmount = scholarshipAmount;
        this.healthInsurancePerAnnum = healthInsurancePerAnnum;
    }
    
    
    /**
     * This is a no-arg constructor with an empty body. It doesn't do anything.
     */
    public StudentFee() {
    }

    /**
     * This setter method is used to set the number of credit hours explicitly.
     * @param creditHours specify the value of credit hours that has been given explicitly.
     */
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * This is a setter method to set the Fee per credit hour explicitly.
     * @param feePerCreditHour specify the value of fee per credit hour that has been specified explicitly.
     */
    public void setFeePerCreditHour(double feePerCreditHour) {
        this.feePerCreditHour = feePerCreditHour;
    }

    /**
     * This is a setter method to set the Scholarship Amount explicitly.
     * @param scholarshipAmount specify the value of scholarship amount that has been specified explicitly.
     */
    public void setScholarshipAmount(double scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
    }

    /**
     * This is a setter method to set the Health Insurance per Annum.
     * @param healthInsurancePerAnnum specify the value of Health Insurance Per Annum that has been specified explicitly.
     */
    public void setHealthInsurancePerAnnum(double healthInsurancePerAnnum) {
        this.healthInsurancePerAnnum = healthInsurancePerAnnum;
    }
    
    /**
     * This method is used to calculate the tution fee foe each student.The tuition fee depends on the number of credit hours student enrolled in. 
     * @return returns the calculated tution fee by multiplying Number of credit hours with Fee per credit hour.
     */
    public double tuitionFee(){
        return this.creditHours*this.feePerCreditHour;
    }

    /**
     * This method is used to get the Scholarship Amount of a student
     * @return returns the scholarship Amount
     */
    public double getScholarshipAmount() {
        return this.scholarshipAmount;
    }
    
    /**
     * This method is used to calculate the Health Insurance Amount on a quaterly basis.
     * @return returns the quarterly insurance cost.
     */
    public double quaterlyHealthInsurance(){
        return (this.healthInsurancePerAnnum*4)/12;
    }
    
    /**
     * This method is used to calculate the total fees of a particular student.
     * @return Returns the total fee amount of the student.
     */
    public double totalFee(){
        return (this.creditHours*this.feePerCreditHour)-this.scholarshipAmount+((this.healthInsurancePerAnnum*4)/12);
    }
    
    /**
     * This method is used to calculate the minimum fee the student should pay.
     * @return Returns the minimum fee a student should pay. 
     */
    public double minimumDue(){
         return ((this.creditHours*this.feePerCreditHour)-this.scholarshipAmount+((this.healthInsurancePerAnnum*4)/12))/2;
    }

    /**
     * This toString() method is overridden, to display the output in a specific form.
     * @return Returns a string representation of a student fee.
     */
    @Override
    public String toString() {
        return "Credit hours: " + this.creditHours + "\nFee per credit hour: $" + this.feePerCreditHour + "\nScholarship amount: $" + this.scholarshipAmount + "\nHealth insurance amount per annum: $" + this.healthInsurancePerAnnum ;
    }
    
    
    
}
