package casepayroll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A small application for processing pay information.
 *
 * @author Dr. Denise Case
 */
public class CasePayroll {
    
    // declare three array lists, one to hold all Employee objects,
    // one to hold all SalaryEmployee objects, and
    // one to hold all HourlyEmployee objects

    
    
    
    // declare two constant strings - one for each datafile 
    // just the filename and extension, e.g. output1.txt
 
    
    
    /**
     * Main method to run the application.
     *
     * @param args - the String array of arguments (not used)
     */
    public static void main(String args[]) {

        final String DIR = System.getProperty("user.dir");
        final String PARTIAL = "/src/casepayroll/";
        final String PATH = DIR + PARTIAL;

        // do everything in one big method so we can run it twice
        // once for the small file and once for the big file.
        CasePayroll.readDataCalculatePayAndDisplayInfo(PATH + SMALL_FILE_NAME);
        CasePayroll.readDataCalculatePayAndDisplayInfo(PATH + LARGE_FILE_NAME);
    }

    /**
     * Read in weekly pay data from a file and calculate the pay.
     *
     * @param fname - the complete path and file name of the data file
     */
    public static void readDataCalculatePayAndDisplayInfo(String fname) {

        // declare a totalPay variable (make it a long)
       

        // declare and initialize a new File (given the fname)
      

        // declare a Scanner and set it to null
       

        // initialize the scanner in a try/catch block
        try {
           
        } // if an exception is thrown, output a helpful message
        catch (FileNotFoundException ex) {
           
        }

        // use a loop to read all the data
        while (sc.hasNextLine()) {

            // read four entries for each record
         
            
            
            

            // convert the third entry to a double
            

            // convert the fourth entry to a double
          
            
            // if the pay rate is > 100 then 
           

                // create a new SalaryEmployee
  
            
                // add add it to the list of employees
                

                // add add it to the list of salaried employees
               
             
            // otherwise
            

                // create a new HourlyEmployee
               

                // add add it to the list of employees
               

                // add add it to the list of hourly employees
               
            }
        }
        // finish with the scanner object
       

        //  calculate pay using a single enhanced for loop
       
    
    

        //  display Total pay = v  (where v is the total pay)
       

        // call a method to display the to string for each salaried employee
       

        // call a method to display the full name for each hourly employee
        

        // call a method to display the count of each
        // e.g. The number of salaried employees = n where n is the count
        // and 
       
    }

    /**
     * Display the toString() content for each salaried employee.
     */
    public static void displaySalariedEmployees() {
       


    }

    /**
     * Display the name (first and last) for each hourly employee.
     */
    public static void displayHourlyEmployeeNames() {
       


    }

    /**
     * Display the type and number of each type of employee in the format: <br>
     * The number of salaried employees = n <br>
     * The number of hourly employees = m <br>
     * Where n and m are the count of salaried and hourly employees,
     * respectively.
     */
    public static void displaySummary() {
        


    }

  
}
/*
 output1.txt results:

 Total pay = 1567
 SalaryEmployee{WEEKS=52.0, annualRate=10000.0, extraPay=10.0}
 SalaryEmployee{WEEKS=52.0, annualRate=45000.0, extraPay=16.0}
 SalaryEmployee{WEEKS=52.0, annualRate=25000.0, extraPay=4.0}
 The number of salaried employees = 3
 The number of hourly employees = 0
 BUILD SUCCESSFUL (total time: 0 seconds)
 */

/*
 output2.txt partial results:

 Total pay = 390601

 (lots of details)

 The number of salaried employees = 396
 The number of hourly employees = 407
 */
