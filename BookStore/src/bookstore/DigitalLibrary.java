package bookstore;

/**
 * Student Name: Brennen Calato
 * Lab Section: 3
 * Assignment: Lab Assignment 5: Publication Citation
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DigitalLibrary {
  

   private ArrayList<Publication> pubs;


  
      //Loads the un-cited publications from the publications.txt file into respective Journal or Proceeding objects, it also sorts the publications
   public void loadPublications() throws FileNotFoundException {
        pubs = new ArrayList<>();
       
       Scanner file = new Scanner(new File("Publications.txt"));

       while(file.hasNextLine()) {
           String line = file.nextLine();          
           String[] fields = line.split(";");
           
           if(fields.length == 9)
           {
               pubs.add(new Journal(fields[0], getPublisher(fields[3].toUpperCase()), fields[2], fields[1], Integer.parseInt(fields[6]), Integer.parseInt(fields[7]), Integer.parseInt(fields[8]), Integer.parseInt(fields[4]), Integer.parseInt(fields[5]))); 
           }
           
           else
           {
               pubs.add(new Proceeding(fields[0], Publisher.valueOf(fields[3].toUpperCase()), fields[2], fields[1], Integer.parseInt(fields[5]), Integer.parseInt(fields[6]), Integer.parseInt(fields[7]), fields[4]));
           }
           
       }
       file.close();
       
   }
   
   //Lists the scientifically cited publications for the user, in the correct order
   public void listPublications()
   {
       Collections.sort(pubs);
       int i = 1;
       for(Publication c: pubs)
       {
           System.out.println("[" + i + "]" + pubs.get(i-1).Cite());
           i++;
       } 
   }
  //Verifies whether the publisher is an approved Publisher variable
   private Publisher getPublisher(String pub)
   {
       try
       {
           return Publisher.valueOf(pub.toUpperCase());
       }
       catch(IllegalArgumentException e)
       {
           throw e;
       }
   }
   //Saves the citations to a user-entered .txt file in their sorted order
   public void saveCitations(String fileName) throws FileNotFoundException
   {
        PrintWriter file = new PrintWriter(fileName + ".txt");
        
       int number = 0;
       for(Publication p: pubs)
       {
           number ++;
           file.println("[" + number + "]" + pubs.get(number-1).Cite());
       } 

        file.close();
       
       System.out.println(number + " citations have been saved to the file " + fileName + ".txt");
   }
}

