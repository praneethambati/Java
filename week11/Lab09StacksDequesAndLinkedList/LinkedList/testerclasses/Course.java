package linkedlists;

/**
 * @author Instructor
 */
public class Course
{
   private String courseID;
   private String courseName;
   private int creditHours;

   public Course(String courseID, String courseName, int creditHours)
   {
      this.courseID = courseID;
      this.courseName = courseName;
      this.creditHours = creditHours;
   }
   
   @Override
   public String toString()
   {
      return courseID + " " + creditHours + " " + courseName;
   }
}
