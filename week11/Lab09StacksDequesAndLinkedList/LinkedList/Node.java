package linkedlists;


/**
 * @author Instructor
 */
public class Node<E>
{
   E data;
   Node<E> nextNode;
   
   public Node(E data)
   {
      this.data = data;
   }
   
   @Override
   public String toString()
   {
      return data.toString();
   }
}
