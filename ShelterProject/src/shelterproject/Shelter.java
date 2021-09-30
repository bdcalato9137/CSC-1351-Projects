package shelterproject;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Student Name: Brennen Calato
 */
public class Shelter 
{
    private String shelterName;
    
    private ArrayList<Animal> animals = new ArrayList<>();
    //Creates a shelter object with a given name
    public Shelter(String shelter)
    {
        shelterName = shelter;
    }
    
    //Adds an animal to the array list that tells which animals are in the shelter
    public void addAnimal(Animal mal)
    {
        animals.add(mal);
    }
    //Prints a list of animals that are ordered by kind, age, or name that are in the shelter.
    public void listAnimals()
    {
        Collections.sort(animals);
        
        System.out.printf("Welcome to %s Shelter%n", shelterName);
        System.out.println("===================================");
        System.out.println("Kind      Age           Name");
        System.out.println("-----------------------------------");
        
        for(Animal c: animals)
        {
            System.out.println(c.printInfo());
        }
        System.out.println("-----------------------------------");
    }
    
    
}
