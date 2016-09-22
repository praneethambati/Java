/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsandmaps;

/**
 *
 * @author Instructor
 */
public class Movie 
{
    
    private String nameOfTheMovie;
    private String directorOfTheMovie;
    private double budgetOfTheMovie;
    private int lengthOfTheMovie;
    private String producerOfTheMovie[];

    public Movie(String nameOfTheMovie, String directorOfTheMovie, 
            double budgetOfTheMovie, int lengthOfTheMovie, 
            String producerOfTheMovie[]) 
    {
        this.nameOfTheMovie = nameOfTheMovie;
        this.directorOfTheMovie = directorOfTheMovie;
        this.budgetOfTheMovie = budgetOfTheMovie;
        this.lengthOfTheMovie = lengthOfTheMovie;
        this.producerOfTheMovie = producerOfTheMovie;
    }
  
}
