package linkedlists;



/**
 * @author Instructor
 */
public class Tester
{

   public static void main(String[] args)   
   {
      ALinkedList<Integer> intList = new ALinkedList<Integer>();
      
      intList.addFirst(17);
      intList.addFirst(25);
      intList.addFirst(47);
      intList.removeFirst();
      intList.addFirst(55);
      
      System.out.println("Contents of linked list\n" + 
         (intList.isEmpty()? "list is empty" : intList));
      
      while(!intList.isEmpty())
      {
         System.out.println("Deleting " + intList.removeFirst());
      }
      System.out.println();
      System.out.println("Contents of linked list\n" + 
         (intList.isEmpty()? "list is empty" : intList));
   }
}
