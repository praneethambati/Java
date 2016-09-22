/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class FacultyDriver
{
    public static void main(String[] args) throws FileNotFoundException
    {

//        This program runs correctly using either the FacultyList class or the 
//        FacultyArray class.  Select the one you want to use by 
//        commenting out one of the statements below.
//        Note: The output should be shown both on the console and saved to a 
//        file. Use Printwriter to save the console output to a file.
        
//        NOTE: The term "faculty list" throughout refers to faculty 
//        objects stored in FacultyList/FacultyArray
        
//	  Create an object named facultyObjectValue of FacultyList class.
          FacultyList facultyObjectValue = new FacultyList(); //Comment this 
//        if you want to use the FacultyArray class
//        
//        FacultyArray facultyObjectValue = new FacultyArray(); //Uncomment this
//        line if you want to use the FacultyArray class and comment the 
//        above FacultyList class.                  
             
	  PrintWriter printOut = new PrintWriter("saveInfoText.txt"); //Creates 
//        a new PrintWriter, without automatic line flushing, with the specified 
//        file name.
          
// 	  declare and initialize a Scanner object named fileReader to 
//        read from the file faculty.txt 

//        Scanner fileReader = new Scanner(new File("faculty.txt"));
		
//        while faculty.txt has more data {
//	  Read in the data, and use the values as arguments for a call to 
//        addFaculty(new Faculty(fileReader.next(),fileReader.next(), 
//        fileReader.nextDouble())).
//		}

//        print the total number of Faculty objects created from 
//        faculty.txt using getTotalFaculty()


//	  print the Contents of faculty list
//	  print the facultyObjectValue		

//	  print the average Salary using findAverageSalary()
//	  example: facultyObjectValue.findAverageSalary()
//        Note:Limit the value of the average salary to 2 decimal points.        

//	  add one of the faculty member to the end of the list by creating the 
//        Faculty object facultyObject and pass it to the 
//        addFaculty(facultyObject)
//        example:  Faculty facultyObject = new Faculty("Gwen", "DeMarco", 
//        39000.45);				
//		facultyObjectValue.addFaculty(facultyObject);


//	  Attempt adding faculty at index 3. Return  Successfully added  
//        if you are able to add the faculty to the list. 
//        Return  Unable to add Faculty .
//        example: facultyObject = new Faculty( Bilbo", "Baggins", 45000.48);
//	  if(facultyObjectValue.addFaculty(3, facultyObject))
//	  {
//          print  Successfully added 
//	  }
//	  else
//	  {
//	     unable to add faculty 
//	  }

		
//	  Attempt adding faculty at index 40. Return  Successfully added  if you 
//        are able to add the faculty to the list, else print 
//         Unable to add Faculty .
//	  Example: facultyObject = new Faculty( Fanny", "Brice", 39000);
//	  if(facultyObjectValue.addFaculty(40, facultyObject))
//	  {
//	 	print  Successfully added 
//	  }
//      else
//	  {
//	 	 unable to add faculty 
//	  }
//

		
// 	Print the getNumberOfFaculty()
//	Example: facultyObjectValue.getNumberOfFaculty()

//	Attempt to remove a faculty at index equal to the number of 
//      faculty in the list and return  Successfully removed  if you are 
//      able to remove, else print  Unable to remove  
//	Example: 
//        if(facultyObjectValue.removeFaculty(facultyObjectValue.getNumberOfFaculty()))
//	  {
//      	print("Successfully removed");
//        } 
//        else
//      {
//		print("Unable to remove");
//	}
// 	  Attempt removing faculty at index 5 and print 
//         Successfully removed  if you are able to remove, else print 
//         unable to remove .
//	 Example: 
//        if(facultyObjectValue.removeFaculty(5)
//	{
//		print   Successfully Removed 
//	}
//	else
//	{
//	Print  unable to remove 	
//      }
		
//	  Attempt removing faculty at index 20 and print 
//        "Successfully removed  if you are able to remove, 
//        else print  unable to remove .
// 	   Example: 
//        if(facultyObjectValue.removeFaculty(20)
//	  {
//		print   Successfully Removed 
//	  }
//	  else
//	  {
//		Print  unable to remove 	
//        }
		
		
//		Print the Contents of the FacultyList/FacultyArray
//		Print  toString  method of FacultyList object.
//		Example: facultyObjectValue.toString()

//		call and print the findAverageSalary() method. 
//		Example: facultyObjectValue.findAverageSalary()
//              Note:Limit the value of the average salary to 2 decimal points.

//		printOut.close();	
             
    }
}