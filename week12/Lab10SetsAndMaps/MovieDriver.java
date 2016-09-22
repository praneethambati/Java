/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsandmaps;


/**
 *
 * @author  Instructor
 */
public class MovieDriver 
{

    public static void main(String[] args)
    {
        // Create a HashSet of Movie and name it as 'hashMovies'.

        // Create a TreeMap of Actor as Key and HashSet<Movie> as value and name it as treeMaps.

        /*
            Create a Scanner object to read Actors and Movie details from "movies.txt" file.
            
        */             
     
        // while movies.txt has more data
        {
		/* The data in the text file will be in the following order: actor last name, actor first name, movie name, movie director name, movie title, movie budget, movie time run, and producer(s) of the movie separated by comma separator. */

            // Read in the data and store the 1st and 2nd line of the text 
            // file to Actor object.
            // Read in the data and store the next 5 lines of the text file to 
            // a Movie object. Make sure that an array of Producers name is 
            // passed in to the movie object.
            // Check the treeMap containsKey of actor for false. 
            // If it is false, then add the actor with new HashSet<Movie> to 
            // the treeMap.

            // If the actor has no movies in the treeMap, then associate the 
            // movie to the actor in treeMap.
            // else if the actor has movie on his name, then the movie should 
            // be appended to the HashSet value of the actor in treeMap.
           
        }
        // Print the Key and value pair using for loop
            System.out.println("Print the key and value pair using for loop:");
            System.out.println("");
            System.out.println("*************************************************");
        // Print the TreeMap object
            System.out.println("Print the TreeMap:");
            System.out.println("");
            System.out.println("*************************************************");
        
    }
}
            






